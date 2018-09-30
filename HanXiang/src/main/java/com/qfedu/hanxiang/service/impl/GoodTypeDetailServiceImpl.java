package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.GoodTypeDetailMapper;

import com.qfedu.hanxiang.pojo.GoodTypeDetail;
import com.qfedu.hanxiang.service.GoodTypeDetailService;
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
public class GoodTypeDetailServiceImpl implements GoodTypeDetailService {

    @Autowired
    private GoodTypeDetailMapper goodTypeDetailMapper;
    @Override
    public Result save(GoodTypeDetail goodTypeDetail) {
        if(goodTypeDetailMapper.insert(goodTypeDetail) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }
    }

    @Override
    public Result selectByGtdid(int gtid) {
        List<GoodTypeDetail> goodTypesDetail= goodTypeDetailMapper.selectByGtid(gtid);
        if(goodTypesDetail!= null && goodTypesDetail.size()>0){
            return new Result(1,"查询到数据",goodTypesDetail);
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }
}



