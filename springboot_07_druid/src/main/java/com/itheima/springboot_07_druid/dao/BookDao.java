package com.itheima.springboot_07_druid.dao;

import com.itheima.springboot_07_druid.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author SHA256
 * @time 2023-05-07 10:46:38
 * @description TODO
 */
@Mapper
public interface BookDao{

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

}
