package com.yandong.order.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yandong.order.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * Program Name: springcloud-nacos-seata
 * <p>
 * Description:
 * <p>
 *
 * @author yandong
 * @version 1.0
 * @date 2019/8/28 4:05 PM
 */
@Mapper
@Repository
public interface OrderDAO extends BaseMapper<Order> {

}
