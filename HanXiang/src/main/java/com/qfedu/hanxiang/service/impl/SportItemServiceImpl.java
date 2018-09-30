package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.SportItemMapper;
import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.pojo.SportItem;
import com.qfedu.hanxiang.service.SportItemService;
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
public class SportItemServiceImpl implements SportItemService {
    @Autowired
    private SportItemMapper sportItemMapper;

    @Override
    public Result save(SportItem sportItem) {
        if(sportItemMapper.insert(sportItem) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }
    }

    @Override
    public Result selectAll() {
        List<SportItem> sportItem = sportItemMapper.selectAll();
        if(sportItem  != null && sportItem .size()>0){
            return new Result(1,"查询到数据",sportItem );
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }

}
