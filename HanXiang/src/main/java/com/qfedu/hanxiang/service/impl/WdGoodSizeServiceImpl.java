package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.WdGoodSizeMapper;
import com.qfedu.hanxiang.pojo.WdGoodSize;
import com.qfedu.hanxiang.service.WdGoodSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WdGoodSizeServiceImpl implements WdGoodSizeService {

    @Autowired
    private WdGoodSizeMapper wdGoodSizeMapper;
    @Override
    public List<WdGoodSize> queryAll(int id) {
        return wdGoodSizeMapper.selectAll(id);
    }
}
