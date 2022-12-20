package com.gjh.libraryboot.Controller;

import com.gjh.libraryboot.Bean.Book;
import com.gjh.libraryboot.Result.code;
import com.gjh.libraryboot.Result.result;
import com.gjh.libraryboot.Service.Serviceimpl.Bookserviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
      @Autowired
      private Bookserviceimpl bookserviceimpl;

      @RequestMapping("/aa")
      public String hel(){
          return "ok";
      }
      @GetMapping
      public result selectall(){
          List<Book> list = bookserviceimpl.selectall();
          String msg =list !=null ? "查询成功":"查询失败";
          return new result(list!=null ? code.get_ok :code.get_err,list,msg);
      }
    @GetMapping("/{bookname}")
    public result selectbyid(@PathVariable String bookname){
        Book book = bookserviceimpl.selectbyid(bookname);
        String msg = book!=null ? "" :"查询失败";
        return new result(book!=null ? code.get_ok :code.get_err,book,msg);
    }
    @PutMapping
    public result update(@RequestBody Book book){
        boolean b = bookserviceimpl.update(book);
        String msg =b ? "编辑成功":"编辑失败";
        return new result(b ? code.update_ok:code.update_err,b,msg);
    }
    @DeleteMapping("/{bookname}")
    public result delete(@PathVariable String bookname){
        boolean b = bookserviceimpl.delete(bookname);
        String msg = b ? "删除成功" : "删除失败";
        return new result(b ? code.delete_ok :code.delete_err,b,msg);
    }
    @PostMapping
    public result save(@RequestBody Book book){
        boolean b = bookserviceimpl.save(book);
        String msg = b ? "添加成功" :"添加失败";
        return new result(b ? code.save_ok :code.save_err,b,msg);
    }
    @GetMapping("/user")
    public result deleteBy(){
          return null;
    }
}
