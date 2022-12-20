package com.gjh.libraryboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }
    @GetMapping("/ddd")
    public String user(){
        return null;
    }
}
public String user(){
    return null;
}
