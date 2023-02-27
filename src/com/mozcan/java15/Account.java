package com.mozcan.java15;

public sealed abstract class Account permits PrivateAccount , SecretAccount {

    abstract void accountName();
}
