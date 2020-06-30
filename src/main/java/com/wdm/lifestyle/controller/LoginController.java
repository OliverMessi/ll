package com.wdm.lifestyle.controller;

import com.wdm.lifestyle.pojo.User;
import com.wdm.lifestyle.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

/**
 * @author wdm
 * @create 2020-06-30 19:46
 **/
@Controller
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User user){
        // 对 html 标签进行转义，防止 XSS 攻击
        String userName = user.getUserName();
        userName = HtmlUtils.htmlEscape(userName);
        if(!Objects.equals("admin", userName) || !Objects.equals("123456", user.getPassWord())){
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        }else {
            return new Result(200);
        }
    }
}