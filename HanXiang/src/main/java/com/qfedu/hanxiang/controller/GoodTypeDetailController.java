package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.GoodType;
import com.qfedu.hanxiang.pojo.GoodTypeDetail;
import com.qfedu.hanxiang.service.GoodTypeDetailService;
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
 */
@Controller
public class GoodTypeDetailController {

    @Autowired
    private GoodTypeDetailService service;

    @RequestMapping("/typeDetailadd.do")
    @ResponseBody
    public Result typeDetailAdd(GoodTypeDetail goodTypeDetail){
        return service.save(goodTypeDetail);
    }

    @RequestMapping("/gtdquery.do")
    @ResponseBody
    public Result QuerybyGtdid(int gtid){
        return service.selectByGtdid(gtid);
    }
}
