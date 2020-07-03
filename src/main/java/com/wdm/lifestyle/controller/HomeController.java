package com.wdm.lifestyle.controller;

import com.wdm.lifestyle.entity.UpdateRecords;
import com.wdm.lifestyle.service.api.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    HomeService homeService;
    @CrossOrigin
    @RequestMapping(value = "api/home/getUpdateRecords")
    @ResponseBody
    public List<UpdateRecords> getUpdateRecords(){

      return homeService.getUpdateRecords();

    }
}
