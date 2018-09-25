package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.WdSuitableMapper;
import com.qfedu.hanxiang.pojo.WdSuitable;
import com.qfedu.hanxiang.service.WdSuitableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WdSuitableServiceImpl implements WdSuitableService {

    @Autowired
    private WdSuitableMapper wdSuitableMapper;


    @Override
    public List<WdSuitable> queryAll(int id) {
        return wdSuitableMapper.selectAll(id);
    }
}
