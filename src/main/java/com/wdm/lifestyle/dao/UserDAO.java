package com.wdm.lifestyle.dao;

import com.wdm.lifestyle.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUserName(String userName);

    User getByUserNameAndPassWord(String userName,String passWord);
}
