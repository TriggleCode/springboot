package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author SHA256
 * @time 2023-05-07 20:06:40
 * @description TODO
 */

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
       /* Book book = bookDao.getById(2);
        System.out.println(book);*/
        Book book = bookDao.selectById(2);
        System.out.println(book);
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");

        bookDao.insert(book);
    }

    @Test
    void testUpdate(){

        Book book = new Book();
        book.setId(13);
        book.setType("测试数据abc");
        book.setName("测试数据123");
        book.setDescription("测试数据123");

        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll(){
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(0,5);
        bookDao.selectPage(page,null);

        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(page.getRecords());

        /*List<Book> page1 = bookDao.page(0, 5);
        for (Book book: page1) {
            System.out.println(book);
        }*/
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = null;
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
/*        if (name != null)
        lqw.like(Book::getName,name);*/
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);
    }


}
