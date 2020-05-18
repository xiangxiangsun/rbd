package cn.seamew.rbd.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String userLogin(){
        return "login";
    }

    @RequestMapping("/index")
    public String userIndex(){
        return "index";
    }

    @RequestMapping("/loginError")
    public String loginError(){
        return "loginError";
    }

    @RequestMapping("/whoim")
    @ResponseBody
    public Object whoIm()
    {
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    @RequestMapping("/work")
    public String work(){
        return "work";
    }

    @RequestMapping("/setting")
    public String setting(){
        return "setting";
    }

    @RequestMapping("/select")
    public String select(){
        return "select";
    }

//    @RequestMapping("/403")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public String sls(){
//        return "403";
//    }
}
