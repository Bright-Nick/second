package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 17:44
 */

public interface ItemsDao {
/**
 * 查询所有
 *
 */
List<Items> findAll();

/**
 * 保存操作
 */
int save (Items items) ;
}
