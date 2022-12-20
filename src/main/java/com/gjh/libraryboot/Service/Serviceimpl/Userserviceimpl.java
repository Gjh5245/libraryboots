package com.gjh.libraryboot.Service.Serviceimpl;

import com.gjh.libraryboot.Bean.User;
import com.gjh.libraryboot.Mapper.Usermapper;
import com.gjh.libraryboot.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice {
    @Autowired
    private Usermapper usermapper;
    @Override
    public User login(User user) {
        return usermapper.login(user);
    }
}
