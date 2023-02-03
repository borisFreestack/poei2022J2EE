package com.freestack.helloworld.apis;

import com.freestack.helloworld.apis.exception.RegisterException;

import java.util.ArrayList;
import java.util.List;

public class UserApi {

    private static List<User> users = new ArrayList<>();

    public static void register(User user) throws RegisterException {
        if(users.stream().filter(userDb->{
            return userDb.getFirstName().equals(user.getFirstName()) && userDb.getLastName().equals(user.getLastName());
        }).count()>0){
            throw new RegisterException("user already registered with username");
        }
        users.add(user);
    }


    public static List<User> getUsers() {
        return users;
    }
}
