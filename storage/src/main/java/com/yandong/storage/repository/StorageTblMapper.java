package com.yandong.storage.repository;

import com.yandong.storage.entity.StorageTbl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StorageTblMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(StorageTbl record);

    int insertOrUpdate(StorageTbl record);

    int insertOrUpdateSelective(StorageTbl record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(StorageTbl record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    StorageTbl selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(StorageTbl record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(StorageTbl record);

    int updateBatch(List<StorageTbl> list);

    int updateBatchSelective(List<StorageTbl> list);

    int batchInsert(@Param("list") List<StorageTbl> list);
}