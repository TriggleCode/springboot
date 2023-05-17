package com.itheima.domain;

import lombok.Data;

/**
 * @author SHA256
 * @time 2023-05-07 19:53:32
 * @description TODO
 * Lombok
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
