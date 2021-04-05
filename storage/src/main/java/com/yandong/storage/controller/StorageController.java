package com.yandong.storage.controller;


import com.yandong.storage.entity.StorageTbl;
import com.yandong.storage.servic.StorageTblService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RestController
@RequestMapping("storage")
public class StorageController {

    @Resource
    private StorageTblService storageService;

    /**
     * 减库存
     * @param commodityCode 商品代码
     * @param count 数量
     * @return
//     */
//    @RequestMapping(path = "/deduct")
//    public Boolean deduct(String commodityCode, Integer count) {
//        storageService.deduct(commodityCode, count);
//        return true;
//    }

    @RequestMapping(path = "/add")
    public Boolean add(String commodityCode, Integer count) {
        StorageTbl storageTbl = new StorageTbl();
        storageTbl.setCount(count);
        storageTbl.setCommodityCode(commodityCode);
        storageService.insert(storageTbl);
        return true;
    }
}
