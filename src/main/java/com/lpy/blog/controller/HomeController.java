package com.lpy.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lulu on 17/3/5.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(
                           HttpServletRequest request){

        return "home";
    }
}
