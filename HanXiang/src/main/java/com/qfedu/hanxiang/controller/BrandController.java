package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.Brand;
import com.qfedu.hanxiang.service.BrandService;
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
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/brandadd.do")
    @ResponseBody
    public Result typeAdd(Brand brand){
        return brandService.save( brand);
    }

    @RequestMapping("/brandquery.do")
    @ResponseBody
    public Result gtQuery(){
        return brandService.selectAll();
    }

}
