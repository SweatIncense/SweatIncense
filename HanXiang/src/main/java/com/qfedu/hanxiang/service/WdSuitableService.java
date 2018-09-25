package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.WdSuitable;

import java.util.List;

public interface WdSuitableService {
    // 二级列表适用人群
    List<WdSuitable> queryAll(int id);
}
