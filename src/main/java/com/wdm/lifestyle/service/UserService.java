package com.wdm.lifestyle.service;

import com.wdm.lifestyle.dao.UserDAO;
import com.wdm.lifestyle.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String userName) {
        User user = getByName(userName);
        return null!=user;
    }

    public User getByName(String userName) {
        return userDAO.findByUserName(userName);
    }

    public User get(String userName, String passWord){
        return userDAO.getByUserNameAndPassWord(userName, passWord);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}
