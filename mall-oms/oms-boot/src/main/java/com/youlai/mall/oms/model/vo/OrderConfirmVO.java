package com.youlai.mall.oms.model.vo;

import com.youlai.mall.oms.model.dto.OrderItemDTO;
import com.youlai.mall.ums.dto.MemberAddressDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 订单确认响应对象
 */
@ApiModel("订单确认响应对象")
@Data
public class OrderConfirmVO {

    /**
     * 订单防重提交令牌
     */
    @ApiModelProperty("订单防重提交令牌")
    private String orderToken;

    /**
     * 订单商品
     */
    @ApiModelProperty("订单商品")
    private List<OrderItemDTO> orderItems;

    /**
     * 会员收货地址列表
     */
    @ApiModelProperty("会员收获地址列表")
    private List<MemberAddressDTO> addresses;

}
