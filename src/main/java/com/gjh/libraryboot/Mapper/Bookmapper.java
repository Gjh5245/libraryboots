package com.gjh.libraryboot.Mapper;

import com.gjh.libraryboot.Bean.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Bookmapper {
    //显示所有图书信息
    public List<Book> selectall();
    //修改时先根据id查找该书籍信息
    public Book selectbyid(String bookname);
    //修改书籍信息
    public boolean update(Book book);
    //删除书籍信息
    public boolean delete(String bookname);
    public boolean save(Book book);
}
