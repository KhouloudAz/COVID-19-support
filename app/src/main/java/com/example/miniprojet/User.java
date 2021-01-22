package com.example.miniprojet;

public class User {
    public String fullName, age, email;

    public User() {

    }

    public User(String fullName, String age, String email) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public String getUserFullName() {
        return fullName;
    }

    public String getUserAge() {
        return age;
    }

    public String getUserEmail() {
        return email;

    }
}
