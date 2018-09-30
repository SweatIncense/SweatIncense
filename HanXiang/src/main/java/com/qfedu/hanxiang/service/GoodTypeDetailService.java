package com.qfedu.hanxiang.service;


import com.qfedu.hanxiang.pojo.GoodTypeDetail;
import com.qfedu.hanxiang.vo.Result;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
public interface GoodTypeDetailService {

    Result save(GoodTypeDetail goodTypeDetail);


    Result selectByGtdid(int gtid);
}
