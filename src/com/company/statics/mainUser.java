package com.company.statics;

public class mainUser {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Popescu");
        user.setSurname("Ion");

        User user2 = new User();
        user2.setName("Gigel");
        user2.setSurname("Alexandru");

        System.out.println(user.getName() + " " + user.getSurname());
    }



}
