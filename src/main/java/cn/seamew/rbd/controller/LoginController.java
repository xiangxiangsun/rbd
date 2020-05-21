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
        return "login2";
    }

    @RequestMapping("/order")
    public String userIndex(){
        return "order";
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


//    @RequestMapping("/403")
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    public String sls(){
//        return "403";
//    }
}
