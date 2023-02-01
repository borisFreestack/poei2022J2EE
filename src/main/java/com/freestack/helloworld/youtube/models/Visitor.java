package com.freestack.helloworld.youtube.models;

public class Visitor extends User {


    @Override
    public boolean canCreate() {
        return false;
    }

    public Visitor(String pseudo, String password) {
        super(pseudo, password);
    }


}
