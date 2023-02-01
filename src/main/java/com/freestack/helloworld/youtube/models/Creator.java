package com.freestack.helloworld.youtube.models;

public class Creator extends User {


    @Override
    public boolean canCreate() {
        return true;
    }

    public Creator(String pseudo, String password) {
        super(pseudo, password);
    }


}
