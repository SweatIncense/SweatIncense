package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.WdBrand;

import java.util.List;

public interface WdBrandService {

    // 二级列表 品牌
    List<WdBrand> queryAll(int id);

}
