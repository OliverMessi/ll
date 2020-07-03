package com.wdm.lifestyle.dao;

import com.wdm.lifestyle.entity.UpdateRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UpdateRecordsDAO extends JpaRepository<UpdateRecords,Integer> {
    //使用@Query注解查询SQL
    //nativeQuery:默认的是false.表示不开启sql查询。是否对value中的语句做转义。
    @Query(value="select * from UPDATE_RECORDS",nativeQuery=true)
    List<UpdateRecords> findUpdateRecords();
}
