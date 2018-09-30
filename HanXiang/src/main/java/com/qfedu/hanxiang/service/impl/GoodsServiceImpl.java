package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.GoodsMapper;
import com.qfedu.hanxiang.pojo.GoodSize;
import com.qfedu.hanxiang.pojo.Goods;
import com.qfedu.hanxiang.service.GoodsService;
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
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public Result save(Goods goods) {
        if(goodsMapper.insert(goods) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }
    }

    @Override
    public Result selectByChoice(Object... values) {
        List<Goods> goods =  goodsMapper.selectByChoice(values);
        if(goods != null && goods.size()>0){
            return new Result(1,"查询到数据",goods);
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }

}
