package cn.seamew.rbd.modules.param;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-29
 */
@Setter
@Getter
public class OrderQueryRequest {
    /**
     * 代理名称
     */
    private String agentName;
    /**
     * 代理唯一tpa
     */
    private String agentUidTpa;
    /**
     * 房间号
     */
    private String roomId;
    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 提交时间 区间（数据库查询用）
     */
    private String submitTimeBegin;
    private String submitTimeEnd;
}
