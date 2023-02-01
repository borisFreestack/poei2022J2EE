package com.freestack.helloworld.youtube.models;

import java.time.LocalDate;
import java.util.Objects;

public abstract class User {

    private String username;
    private String password;
    private LocalDate birthDate;
    private String firstname;
    private String lastname;
    private String sex;

    public abstract boolean canCreate();

    public User(String pseudo, String password) {
        this.username = pseudo;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public User setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        User otherUser = (User) o;
        return Objects.equals(username, otherUser.username);
    }

    @Override
    public int hashCode() {
        int value = Objects.hash(username, password);
        return value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
