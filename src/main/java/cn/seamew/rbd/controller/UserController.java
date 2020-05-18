package cn.seamew.rbd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUsers(){
        return "Hello Spring Security";
    }
}
