package cn.seamew.rbd.mapper;

import cn.seamew.rbd.modules.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashSet;

@Mapper
public interface RoleMapper {

    @Select("select * from sys_role where id = #{id}")
    SysRole selectById(Integer id);

    Integer selectIdByName(@Param("username") String username);


    HashSet<String> selectAllMenuByRoleId(Integer roleId);
}
