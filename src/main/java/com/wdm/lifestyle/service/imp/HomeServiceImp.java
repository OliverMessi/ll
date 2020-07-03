package com.wdm.lifestyle.service.imp;

import com.wdm.lifestyle.dao.UpdateRecordsDAO;
import com.wdm.lifestyle.entity.UpdateRecords;
import com.wdm.lifestyle.service.api.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("homeService")
@Transactional
public class HomeServiceImp implements HomeService{
    @Autowired
    UpdateRecordsDAO updateRecordsDAO;
    /**
     * @Title:
     * @Description: 获取更新记录信息
     * @author: 王东描
     * @param
     * @date 2020/7/3  14:45
     * 最后修改人: 王东描
     * 最后修改时间：2020/7/3  14:45
     */
    @Override
    public List<UpdateRecords> getUpdateRecords() {
        return updateRecordsDAO.findUpdateRecords();
    }
}
