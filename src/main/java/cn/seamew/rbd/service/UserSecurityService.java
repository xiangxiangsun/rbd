package cn.seamew.rbd.service;

import cn.seamew.rbd.entity.SysUser;
import cn.seamew.rbd.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */
@Service
public class UserSecurityService {

    @Resource
    private UserMapper userMapper;

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }

}
