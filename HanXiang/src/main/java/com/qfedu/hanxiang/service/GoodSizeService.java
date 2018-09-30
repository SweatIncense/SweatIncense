package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.GoodSize;

import com.qfedu.hanxiang.vo.Result;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
public interface GoodSizeService {

    Result save(GoodSize goodSize);


    Result selectAll();

}
