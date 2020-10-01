package com.itheima.aspect;

import org.springframework.stereotype.Component;

/**
 * @author Bright·King
 * @version 1.0
 * @date 2020/9/28 19:55
 */
@Component
public class PermissionAspect {
    public void checkPermission(){
        System.out.println("校验权限。。。");
    }
}
