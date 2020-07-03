package com.wdm.lifestyle.service.api;


import com.wdm.lifestyle.entity.UpdateRecords;

import java.util.List;

public interface HomeService {
    /**
     * @Title:
     * @Description: 获取更新记录信息
     * @author: 王东描
     * @param
     * @date 2020/7/3  14:46
     * 最后修改人: 王东描
     * 最后修改时间：2020/7/3  14:46
     */
    public List<UpdateRecords> getUpdateRecords();

}
