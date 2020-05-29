package cn.seamew.rbd.controller;

import cn.seamew.rbd.modules.param.OrderQueryRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-29
 */
@RestController
@RequestMapping("/v1")
public class OrderRestController {

    @PostMapping("/QueryOrder")
    public String QueryOrder(@RequestBody OrderQueryRequest orderQueryRequest){
        return null;
    }

}
