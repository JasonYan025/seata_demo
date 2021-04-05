package com.yandong.storage.servic;

import com.yandong.storage.entity.StorageTbl;
import com.yandong.storage.repository.StorageTblMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StorageTblService{

    @Resource
    private StorageTblMapper storageTblMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return storageTblMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(StorageTbl record) {
        return storageTblMapper.insert(record);
    }

    
    public int insertOrUpdate(StorageTbl record) {
        return storageTblMapper.insertOrUpdate(record);
    }

    
    public int insertOrUpdateSelective(StorageTbl record) {
        return storageTblMapper.insertOrUpdateSelective(record);
    }

    
    public int insertSelective(StorageTbl record) {
        return storageTblMapper.insertSelective(record);
    }

    
    public StorageTbl selectByPrimaryKey(Integer id) {
        return storageTblMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(StorageTbl record) {
        return storageTblMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(StorageTbl record) {
        return storageTblMapper.updateByPrimaryKey(record);
    }

    
    public int updateBatch(List<StorageTbl> list) {
        return storageTblMapper.updateBatch(list);
    }

    
    public int updateBatchSelective(List<StorageTbl> list) {
        return storageTblMapper.updateBatchSelective(list);
    }

    
    public int batchInsert(List<StorageTbl> list) {
        return storageTblMapper.batchInsert(list);
    }

}
