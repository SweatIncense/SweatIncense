package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.Brand;
import com.qfedu.hanxiang.pojo.SportItem;
import com.qfedu.hanxiang.service.SportItemService;
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
public class SportItemController {

    @Autowired
    private SportItemService sportItemService;

    @RequestMapping("/spiadd.do")
    @ResponseBody
    public Result typeAdd(SportItem sportItem){
        return sportItemService.save( sportItem);
    }

    @RequestMapping("/spiquery.do")
    @ResponseBody
    public Result gtQuery(){
        return sportItemService.selectAll();
    }
}
