package com.qfedu.hanxiang.service;

import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.pojo.SportItem;
import com.qfedu.hanxiang.vo.Result;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
public interface SportItemService {

    Result save(SportItem sportItem);


    Result selectAll();

}
