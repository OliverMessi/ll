package com.wdm.lifestyle.service.imp;

import com.wdm.lifestyle.dao.UserDAO;
import com.wdm.lifestyle.entity.User;
import com.wdm.lifestyle.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService{
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String userName) {
        User user = getByName(userName);
        return null!=user;
    }

    public User getByName(String userName) {
        return userDAO.findByUserName(userName);
    }

    /**
     * @Title:
     * @Description: 获取用户信息
     * @author: 王东描
     * @param
     * @date 2020/7/3  15:00
     * 最后修改人: 王东描
     * 最后修改时间：2020/7/3  15:00
     */
    public User getInfo(String userName, String passWord){
        return userDAO.getByUserNameAndPassWord(userName, passWord);
    }

    public void add(User user) {
        userDAO.save(user);
    }
}
