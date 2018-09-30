package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.GoodSize;
import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.service.GoodSizeService;
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
public class GoodSizeControll {

    @Autowired
    private GoodSizeService goodSizeService;
    @RequestMapping("/gsadd.do")
    @ResponseBody
    public Result typeAdd(GoodSize goodSize){
        return goodSizeService.save(goodSize);
    }

    @RequestMapping("/gsquery.do")
    @ResponseBody
    public Result gtQuery(){
        return goodSizeService.selectAll();
    }
}
