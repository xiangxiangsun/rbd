package cn.seamew.rbd.service;

import cn.seamew.rbd.modules.entity.SysUserRole;
import cn.seamew.rbd.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */
@Service
public class UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId){return userRoleMapper.ListByUserId(userId);}
}
