package com.example.Prosec.dao;

import com.example.Prosec.Model.User;

import java.util.UUID;

public interface UserDao {

        int insertUser(UUID id , User user);
        default int insertUser(User user){
            UUID id = UUID.randomUUID();
            return insertUser(id,user);
        }
}
