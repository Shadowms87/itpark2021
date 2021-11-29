package lesson9.implementation;

import lesson9.Account;

import java.security.PublicKey;

public class PersonalAccount extends Account {

    public PersonalAccount(String name) {
        super(name);
    }

    public static  String getBic(){

        return "464315021";
    }
}
