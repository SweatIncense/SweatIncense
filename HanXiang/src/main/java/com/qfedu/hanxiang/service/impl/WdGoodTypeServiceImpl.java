package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.WdGoodTypeMapper;
import com.qfedu.hanxiang.pojo.WdGoodType;
import com.qfedu.hanxiang.service.WdGoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WdGoodTypeServiceImpl implements WdGoodTypeService {

    @Autowired
    private WdGoodTypeMapper wdGoodTypeMapper;


    @Override
    public List<WdGoodType> queryAll() {
        return wdGoodTypeMapper.selectAll();
    }
}
