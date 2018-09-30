package com.qfedu.hanxiang.service.impl;

import com.qfedu.hanxiang.mapper.BrandMapper;
import com.qfedu.hanxiang.pojo.Brand;
import com.qfedu.hanxiang.pojo.GoodSize;
import com.qfedu.hanxiang.service.BrandService;
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
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public Result save(Brand brand) {
        if(brandMapper.insert(brand) > 0){
            return  Result.setOK();
        }else{
            return  Result.setError();
        }
    }

    @Override
    public Result selectAll() {
        List<Brand> brand = brandMapper.selectAll();
        if(brand != null && brand.size()>0){
            return new Result(1,"查询到数据",brand);
        }else{
            return new Result(0,"无数据","未查询到数据");
        }
    }

}
