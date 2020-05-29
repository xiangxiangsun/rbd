package cn.seamew.rbd.modules.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: sunxiangxiang
 * @data: 2020-05-29
 */
@Setter
@Getter
public class orderVo {

    /**
     * 账户名称
     */
    private String accountName;
    /**
     * 代理名称
     */
    private String agentName;
    /**
     * 代理唯一标识tpa
     */
    private String agentUidTpa;
    /**
     * 订单价格
     */
    private String orderPrice;
    /**
     * 订单状态
     */
    private String orderStatus;
    /**
     * 订单唯一标识
     */
    private String orderUid;
    /**
     * 账户密码
     */
    private String password;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品数目
     */
    private String productNum;
    /**
     * 房间号码
     */
    private String roomId;
    /**
     * 提交时间
     */
    private String submitTime;
    /**
     * 有效期（单位：月）
     */
    private String validityMonth;

    /**
     * 页码
     */
    private Integer currentPage;
    /**
     * 每页记录数
     */
    private Integer pageSize;
    /**
     * 查询条件
     */
    private String queryString;

}
