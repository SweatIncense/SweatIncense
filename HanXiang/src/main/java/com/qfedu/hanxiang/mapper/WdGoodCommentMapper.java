package com.qfedu.hanxiang.mapper;

import com.qfedu.hanxiang.pojo.WdGoodComment;

public interface WdGoodCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WdGoodComment record);

    int insertSelective(WdGoodComment record);

    WdGoodComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WdGoodComment record);

    int updateByPrimaryKey(WdGoodComment record);
}