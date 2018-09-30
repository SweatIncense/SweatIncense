package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.service.GoodTypeService;
import com.qfedu.hanxiang.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 *
 */
@Controller
public class GoodTypeController {

    @Autowired
    private GoodTypeService service;

    @RequestMapping("/typeadd.do")
    @ResponseBody
    public Result typeAdd(GoodType goodType){
        return service.save(goodType);
    }

    @RequestMapping("/gtquery.do")
    @ResponseBody
    public Result gtQuery(){
        return service.selectAll();
    }

}
