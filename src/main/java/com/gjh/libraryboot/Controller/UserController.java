package com.gjh.libraryboot.Controller;

import com.gjh.libraryboot.Bean.User;
import com.gjh.libraryboot.Result.code;
import com.gjh.libraryboot.Result.result;
import com.gjh.libraryboot.Service.Serviceimpl.Userserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Userserviceimpl userserviceimpl;
    @PostMapping
    public result login(@RequestBody User user, HttpSession session){
        User user1 = userserviceimpl.login(user);
        session.setAttribute("user",user1);
        String msg =user1 !=null ? "查询成功":"查询失败";
        return new result(user1 !=null ? code.get_ok:code.get_err,user1,msg);
    }
}
