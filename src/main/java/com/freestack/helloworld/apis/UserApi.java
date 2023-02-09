package com.freestack.helloworld.apis;

import com.freestack.helloworld.apis.exception.RegisterException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public static User authenticate(String username, String password) throws Exception {

        Optional<User> useroptional = users.stream()
        .filter(user -> user.getPassword().equals(password) && user.getUsername().equals(username)).findFirst();

        if(useroptional.isPresent()){
            return useroptional.get();
        }

        throw  new Exception("Invalid username or password");
    }


    public static List<User> getUsers() {
        return users;
    }
}
