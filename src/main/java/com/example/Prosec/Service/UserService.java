package com.example.Prosec.Service;

import com.example.Prosec.Model.User;
import com.example.Prosec.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao ;

    @Autowired
    public UserService(@Qualifier("UsrSrv") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user){
        return userDao.insertUser(user);
    }
}
