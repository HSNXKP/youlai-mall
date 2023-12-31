package com.youlai.mall.oms.service.app.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youlai.mall.oms.mapper.OrderDeliveryMapper;
import com.youlai.mall.oms.model.entity.OmsOrderDelivery;
import com.youlai.mall.oms.service.app.OrderDeliveryService;
import org.springframework.stereotype.Service;

@Service("orderDeliveryService")
public class OrderDeliveryServiceImpl extends ServiceImpl<OrderDeliveryMapper, OmsOrderDelivery> implements OrderDeliveryService {

}
