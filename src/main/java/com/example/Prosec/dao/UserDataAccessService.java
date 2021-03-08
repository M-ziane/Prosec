package com.example.Prosec.dao;

import com.example.Prosec.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("UsrSrv")
public class UserDataAccessService implements UserDao{

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(new User(id,user.getType_user(), user.getEmail(), user.getPassword()));
        return 1;
    }
}
