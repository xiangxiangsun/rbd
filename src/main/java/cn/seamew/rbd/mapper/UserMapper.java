package cn.seamew.rbd.mapper;

import cn.seamew.rbd.modules.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from sys_user where username = #{name}")
    SysUser selectByName(String name);
}
