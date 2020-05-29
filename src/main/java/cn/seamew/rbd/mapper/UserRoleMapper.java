package cn.seamew.rbd.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import cn.seamew.rbd.modules.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRoleMapper extends BaseMapper<SysUserRole> {

    @Select("select * from sys_role_user where user_id = #{userId}")
    public List<SysUserRole> ListByUserId(@Param("userId") Integer userId);

}
