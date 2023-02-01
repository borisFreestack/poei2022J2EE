package com.freestack.helloworld.youtube.apis;

import com.freestack.helloworld.youtube.exceptions.LoginException;
import com.freestack.helloworld.youtube.exceptions.RegisterException;
import com.freestack.helloworld.youtube.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserApi {

    private static List<User> users = new ArrayList<>();

    public static void register(User user) throws RegisterException {
        
        if(users.stream().filter(userDb->userDb.getUsername().equals(user.getUsername())).count()>0){
            throw new RegisterException("user already registered with username");
        }
        users.add(user);
    }

    public static User login(String username, String password) throws LoginException {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword()
                    .equals(password)) {
                return user;
            }
        }
        throw new LoginException("wrong credentials");
    }

}
