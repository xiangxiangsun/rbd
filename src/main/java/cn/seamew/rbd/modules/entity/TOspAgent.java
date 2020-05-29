package cn.seamew.rbd.modules.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class TOspAgent {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 代理唯一标识
     */
    private String agentUid;

    /**
     * 代理名称
     */
    private String agentName;

    /**
     * 代理密码
     */
    private String agentPwd;

    /**
     * 代理唯一标识tpa
     */
    private String agentUidTpa;

    /**
     * 代理价格
     */
    private BigDecimal agentPrice;

    /**
     * 注册时间
     */
    private Date registerTime;
}

