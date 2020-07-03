package com.wdm.lifestyle.controller;

import com.wdm.lifestyle.entity.User;
import com.wdm.lifestyle.result.Result;
import com.wdm.lifestyle.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

/**
 * @author wdm
 * @create 2020-06-30 19:46
 **/
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User user){
        // 对 html 标签进行转义，防止 XSS 攻击
        String userName = user.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
        User u = userService.getInfo(userName, user.getPassWord());
        if (null == u) {
            return new Result(400);
        } else {
            return new Result(200);
        }

    }
}