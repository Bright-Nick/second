package com.itheima.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 17:26
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;
}
