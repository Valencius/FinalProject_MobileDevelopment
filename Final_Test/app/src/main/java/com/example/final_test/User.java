package com.example.final_test;

public class User {
    private String username,email,password,IDBimbel;

    public User(String username, String email, String password, String IDBimbel) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.IDBimbel= IDBimbel;
    }



    public String getPassword() { return  password; }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDBimbel() { return  IDBimbel; }

    public void setIDBimbel(String IDBimbel) {
        this.IDBimbel = IDBimbel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
