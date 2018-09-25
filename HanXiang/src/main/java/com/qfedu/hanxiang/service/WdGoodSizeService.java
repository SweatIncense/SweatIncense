package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.WdGoodSize;

import java.util.List;

public interface WdGoodSizeService {
    // 商品二级列表尺码
    List<WdGoodSize> queryAll(int id);
}
