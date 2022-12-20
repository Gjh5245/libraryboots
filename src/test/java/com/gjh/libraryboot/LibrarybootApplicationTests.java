package com.gjh.libraryboot;

import com.gjh.libraryboot.Bean.Book;
import com.gjh.libraryboot.Bean.User;
import com.gjh.libraryboot.Service.Serviceimpl.Bookserviceimpl;
import com.gjh.libraryboot.Service.Serviceimpl.Userserviceimpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LibrarybootApplicationTests {
  @Autowired
  private Userserviceimpl userserviceimpl;
  @Autowired
  private Bookserviceimpl bookserviceimpl;
    @Test
    //用户登录
    void contextLoads() {
        User user = new User();
        user.setUsername("guojiahui");
        user.setPassword("cnm7788.");
        User login = userserviceimpl.login(user);
        System.out.println(login);
    }
    //显示所有书籍
    @Test
    void selectallbook(){
        List<Book> books = bookserviceimpl.selectall();
        System.out.println(books);
    }
    //编辑书籍信息时首先根据书籍id查找书籍
    @Test
    void selectbyid(){

    }
    //查询书籍
    @Test
    void update(){

    }
    //删除书籍信息
    @Test
    void delete(){
        boolean b = bookserviceimpl.delete("西游记");
        System.out.println(b);
    }
    //添加书籍
    @Test
    void save(){
        Book book = new Book();
        book.setBookname("郭家辉");
        book.setBookmoney("90");
        book.setBookusername("张天慧");
        boolean b = bookserviceimpl.save(book);
        System.out.println(b);
    }
}
