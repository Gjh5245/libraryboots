package com.gjh.libraryboot.Service;

import com.gjh.libraryboot.Bean.Book;

import java.util.List;

public interface Bookservice {
    public List<Book> selectall();
    public Book selectbyid(String bookname);
    public boolean update(Book book);
    public boolean delete(String bookname);
    public boolean save(Book book);
}
