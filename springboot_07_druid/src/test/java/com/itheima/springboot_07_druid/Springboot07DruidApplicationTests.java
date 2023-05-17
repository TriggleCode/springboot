package com.itheima.springboot_07_druid;

import com.itheima.springboot_07_druid.dao.BookDao;
import com.itheima.springboot_07_druid.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class Springboot07DruidApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入查询的书id");
        int nextInt = scanner.nextInt();
        Book book = bookDao.getById(nextInt);
        System.out.println(book);
    }

}
