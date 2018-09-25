package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodTypeDetali;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WdGoodTypeDetaliMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodTypeDetali record);

    int insertSelective(WdGoodTypeDetali record);

    WdGoodTypeDetali selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodTypeDetali record);

    int updateByPrimaryKey(WdGoodTypeDetali record);

    List<WdGoodTypeDetali> selectAll(@Param("id") int id);

}