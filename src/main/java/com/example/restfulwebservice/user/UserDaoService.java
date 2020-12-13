package com.example.restfulwebservice.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private  static int usersCount = 3;
    static{
        users.add(new User(1, "Kenneth", new Date()));
        users.add(new User(2, "Kane", new Date()));
        users.add(new User(3, "Son", new Date()));
    }

    public List<User>findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User FindOne(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }



}