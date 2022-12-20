package com.gjh.libraryboot.Service.Serviceimpl;

import com.gjh.libraryboot.Bean.Book;
import com.gjh.libraryboot.Mapper.Bookmapper;
import com.gjh.libraryboot.Service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Bookserviceimpl implements Bookservice {
    @Autowired
    private Bookmapper bookmapper;
    @Override
    public List<Book> selectall() {
        return bookmapper.selectall();
    }

    @Override
    public Book selectbyid(String bookname) {
        return bookmapper.selectbyid(bookname);
    }

    @Override
    public boolean update(Book book) {
        return bookmapper.update(book);
    }

    @Override
    public boolean delete(String bookname) {
        return bookmapper.delete(bookname);
    }

    @Override
    public boolean save(Book book) {
        return bookmapper.save(book);
    }

}
