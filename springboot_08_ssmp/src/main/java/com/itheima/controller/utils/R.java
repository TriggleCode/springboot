package com.itheima.controller.utils;

import com.itheima.dao.BookDao;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SHA256
 * @time 2023-05-09 20:00:15
 * @description TODO
 */
@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }
}
