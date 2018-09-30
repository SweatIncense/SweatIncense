package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.GoodSizeMapper;
import com.qfedu.hanxiang.pojo.GoodSize;
import com.qfedu.hanxiang.pojo.GoodTypeDetail;
import com.qfedu.hanxiang.service.GoodSizeService;
import com.qfedu.hanxiang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
@Service
public class GoodSizeServiceImpl implements GoodSizeService {
    @Autowired
    private  GoodSizeMapper goodSizeMapper;
    @Override
    public Result save(GoodSize goodSize) {
        if(goodSizeMapper.insert(goodSize) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }
    }

    @Override
    public Result selectAll() {
        List<GoodSize> goodSize = goodSizeMapper.selectAll();
        if(goodSize != null && goodSize.size()>0){
            return new Result(1,"查询到数据",goodSize);
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }
}

