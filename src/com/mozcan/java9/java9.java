package com.mozcan.java9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java9 {

    public static void main(String[] args) {
        System.out.println("Private Method in Interface");

        Writable writeObj = new IWritable();
        writeObj.write();

        System.out.println("-----------------------------------------------");

        System.out.println("takeWhile, dropWhile have been added in Stream");

        Stream<Integer> streamTake = Stream.of(4,8,12,23,31,40,41);
        Stream<String> streamDrop = Stream.of("Ali", "Ahmet", "Mustafa", "Kemal", "Atatürk");


        // takeWhile returns a stream of the remaining elements of this stream after taken the longest prefix of elements
        streamTake.takeWhile(num -> num%4 == 0).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        // dropWhile to drop all the names matches passed predicate
        streamDrop.dropWhile(name -> (name.charAt(0) == 'A')).forEach(System.out::println);

        System.out.println("-----------------------------------------------");


        System.out.println("ofNullable has been added");

        // Before Java 9 version - NullPointerException
        /**
         * Stream<Integer> streamNull = Stream.of(null);
         * System.out.println("Stream size:"+streamNull.count());
         */

        // After Java 9 version
        Stream<Integer> streamOfNullable = Stream.ofNullable(null);
        System.out.println("Stream size:"+streamOfNullable.count());

        System.out.println("-----------------------------------------------");

        System.out.println("Collection Factory Method");

        // Before Java 9
        List<Integer> intListBefore9 = new ArrayList<>();
        intListBefore9.add(1);
        intListBefore9.add(3);
        intListBefore9.add(5);

        // After Java 9
        List<Integer> intListAfter9 = List.of(1,3,5);

        System.out.println("-----------------------------------------------");

        System.out.println("FLOW API");

        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        EndSubscriber<String> subscriber = new EndSubscriber<>();
        publisher.subscribe(subscriber);
        List<String> items = List.of("1", "x", "2", "x", "3", "x");

        items.forEach(pub -> {
            publisher.submit(pub);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        publisher.close();

        System.out.println("-----------------------------------------------");

        System.out.println("Inner Class Diamond Operator");

        // This is before Java 7. We have to explicitly mention generic type
        // in the right side as well.
        List<String> myListJava7 = new ArrayList<String>();

        // Since Java 7, no need to mention generic type in the right side
        // instead we can use diamond operator. Compiler can infer type.
        List<String> myListJava9 = new ArrayList<>();

    }


    public static class EndSubscriber<T> implements Flow.Subscriber<T> {
        private Flow.Subscription subscription;

        @Override
        public void onSubscribe(Flow.Subscription subscription) {
            this.subscription = subscription;
            subscription.request(1);
        }

        @Override
        public void onNext(T item) {
            System.out.println("Got : " + item);
            subscription.request(1);
        }

        @Override
        public void onError(Throwable throwable) {
            throwable.printStackTrace();
        }

        @Override
        public void onComplete() {
            System.out.println("Done");
        }
    }
}
