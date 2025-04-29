package com.example.listviewapplication;

/**
 * Created by parsian pc on 10/25/2020.
 */
public class User {
    public String username;
    public String phoneNumber;
    public String emailAddress;
    public int imageSource;
    public User(String username,String phoneNumber,String emailAddress,int imageSource){
        this.username=username;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.imageSource=imageSource;
    }
}
