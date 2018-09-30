package com.qfedu.hanxiang.mapper;


import com.qfedu.hanxiang.pojo.GoodTypeDetail;

import java.util.List;

public interface GoodTypeDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodTypeDetail record);

    int insertSelective(GoodTypeDetail record);

    GoodTypeDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodTypeDetail record);

    int updateByPrimaryKey(GoodTypeDetail record);

    //查询所有类型
    List<GoodTypeDetail> selectByGtid(int gtid);
}