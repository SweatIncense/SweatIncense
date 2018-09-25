package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.WdBrandMapper;
import com.qfedu.hanxiang.pojo.WdBrand;
import com.qfedu.hanxiang.service.WdBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WdBrandServiceImpl implements WdBrandService {

    @Autowired
    private WdBrandMapper wdBrandMapper;


    @Override
    public List<WdBrand> queryAll(int id) {
        return wdBrandMapper.selectAll(id);
    }
}
