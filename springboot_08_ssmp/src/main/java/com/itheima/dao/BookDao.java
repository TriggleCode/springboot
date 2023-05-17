package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookDao extends BaseMapper<Book> {

    @Select("select * from tbl_book limit #{id},#{id2}")
    List<Book> page(Integer id , int id2);


}
