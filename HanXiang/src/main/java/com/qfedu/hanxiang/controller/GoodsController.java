package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.GoodSize;
import com.qfedu.hanxiang.pojo.Goods;
import com.qfedu.hanxiang.service.GoodsService;
import com.qfedu.hanxiang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
@Controller
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goodsadd.do")
    @ResponseBody
    public Result goodAdd(Goods goods){
        return goodsService.save(goods);
    }

    @RequestMapping("/goodsquery.do")
    @ResponseBody
    public Result goodQuery(Object... values){
        return goodsService.selectByChoice(values);
    }


}
