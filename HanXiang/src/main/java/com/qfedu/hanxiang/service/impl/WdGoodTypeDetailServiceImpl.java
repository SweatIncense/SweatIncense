package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.WdGoodTypeDetaliMapper;
import com.qfedu.hanxiang.pojo.WdGoodTypeDetali;
import com.qfedu.hanxiang.service.WdGoodTypeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WdGoodTypeDetailServiceImpl implements WdGoodTypeDetailService {

    @Autowired
    private WdGoodTypeDetaliMapper wdGoodTypeDetaliMapper;


    @Override
    public List<WdGoodTypeDetali> queryAll(int id) {
        List<WdGoodTypeDetali> wdGoodTypeDetalis = wdGoodTypeDetaliMapper.selectAll(id);
        return wdGoodTypeDetalis;
    }
}
