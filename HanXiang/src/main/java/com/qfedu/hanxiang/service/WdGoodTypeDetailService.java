package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.WdGoodTypeDetali;

import java.util.List;

public interface WdGoodTypeDetailService {
    // 二级列表产品分类
    List<WdGoodTypeDetali> queryAll(int id);
}
