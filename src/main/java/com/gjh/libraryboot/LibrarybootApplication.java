package com.gjh.libraryboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.gjh.libraryboot.Mapper")
@SpringBootApplication
public class LibrarybootApplication {

    public static void main(String[] args) {

        SpringApplication.run(LibrarybootApplication.class, args);
    }

}
