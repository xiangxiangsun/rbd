package cn.seamew.rbd.modules.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-17
 */

@Setter
@Getter
@TableName(value = "sys_user_role")
public class SysUserRole implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer roleId;
}
