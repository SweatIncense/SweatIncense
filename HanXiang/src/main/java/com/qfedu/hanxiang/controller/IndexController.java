package com.qfedu.hanxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Author feri
 *@Date Created in 2018/9/12 14:18
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "text.html";
    }
}
