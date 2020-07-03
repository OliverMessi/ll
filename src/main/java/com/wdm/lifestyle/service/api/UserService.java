package com.wdm.lifestyle.service.api;

import com.wdm.lifestyle.entity.User;

public interface UserService {
    /**
     * @Title:
     * @Description:获取用户信息
     * @author: 王东描
     * @param
     * @date 2020/7/3  14:59
     * 最后修改人: 王东描
     * 最后修改时间：2020/7/3  14:59
     */
    public User getInfo(String userName, String passWord);
}
