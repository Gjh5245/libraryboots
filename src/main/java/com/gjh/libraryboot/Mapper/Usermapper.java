package com.gjh.libraryboot.Mapper;

import com.gjh.libraryboot.Bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Usermapper {
    public User login(User user);
}
