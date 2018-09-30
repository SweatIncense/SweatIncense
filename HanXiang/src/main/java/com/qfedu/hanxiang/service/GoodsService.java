package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.Goods;
import com.qfedu.hanxiang.vo.Result;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
public interface GoodsService {

    Result save(Goods goods);


    Result selectByChoice(Object... values);
}
