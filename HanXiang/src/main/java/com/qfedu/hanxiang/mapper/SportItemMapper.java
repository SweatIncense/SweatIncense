package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.SportItem;

import java.util.List;

public interface SportItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SportItem record);

    int insertSelective(SportItem record);

    SportItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SportItem record);

    int updateByPrimaryKey(SportItem record);

    List<SportItem> selectAll();
}