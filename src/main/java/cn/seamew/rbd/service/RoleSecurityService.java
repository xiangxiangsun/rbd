package cn.seamew.rbd.service;

import cn.seamew.rbd.entity.SysRole;
import cn.seamew.rbd.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */

@Service
public class RoleSecurityService {
    @Resource
    private RoleMapper roleMapper;

    public SysRole selectById(Integer id){return roleMapper.selectById(id);}
}
