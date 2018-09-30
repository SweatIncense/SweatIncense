package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.GoodTypeMapper;
import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.service.GoodTypeService;
import com.qfedu.hanxiang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
@Service
@Transactional
public class GoodTypeServiceImpl implements GoodTypeService {

    @Autowired
    private GoodTypeMapper goodTypeMapper;

   //类型新增
    @Override
    public Result save(GoodType goodType) {
        if(goodTypeMapper.insert(goodType) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }

    }

    //类型查询
    @Override
    public Result selectAll() {
        List<GoodType> goodTypes = goodTypeMapper.selectAll();
        if(goodTypes != null && goodTypes.size()>0){
            return new Result(1,"查询到数据",goodTypes);
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }
}
