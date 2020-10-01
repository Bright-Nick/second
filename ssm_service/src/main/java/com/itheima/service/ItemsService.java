package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 19:48
 */

public interface ItemsService {
    List<Items> findAll();


    int save(Items items);
}
