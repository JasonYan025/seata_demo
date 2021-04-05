package com.yandong.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
@FeignClient(name = "storage")
public interface StorageFeignClient {

    @GetMapping("storage/deduct")
    Boolean deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);

    @GetMapping("storage/add")
    Boolean add(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);
}
