package cn.seamew.rbd.modules.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TOspOrder {
    /**
     * 账户面
     */
    private Integer id;

    /**
     * 订单唯一标识
     */
    private String orderUid;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品数量
     */
    private Integer productNum;

    /**
     * 房间号码
     */
    private String roomId;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 账户名称
     */
    private String accountName;

    /**
     * 账户密码
     */
    private String password;

    /**
     * 有效期（单位：月）
     */
    private Integer validityMonth;

    /**
     * 代理唯一标识tpa
     */
    private String agentUid;

    /**
     * 提交时间
     */
    private Date submitTime;
}

