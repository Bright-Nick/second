package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 20:39
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    /**
     * 查询所有
     */
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("items",itemsService.findAll());
        System.out.println(itemsService.findAll());
        return "items";
    }


/**
 * 事务测试
 * 增加商品
 */
    @RequestMapping("/save")
    public String save(Items items){
        int acount=itemsService.save(items);
        return "redirect:/items/findAll";
    }

}
