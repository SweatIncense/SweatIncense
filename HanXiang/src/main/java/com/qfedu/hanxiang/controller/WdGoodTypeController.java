package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.WdGoodType;
import com.qfedu.hanxiang.service.WdGoodTypeService;
import com.qfedu.hanxiang.vo.RList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WdGoodTypeController {

    @Autowired
    private WdGoodTypeService wdGoodTypeService;

    @RequestMapping("/goodtypelist.do")
    @ResponseBody
    public RList<WdGoodType> goodTypeRList() {
        List<WdGoodType> wdGoodTypes = wdGoodTypeService.queryAll();
        if (wdGoodTypes != null) {
            RList<WdGoodType> rList = new RList(0, "成功", wdGoodTypes);
            return rList;
        } else {
            return RList.error();
        }
    }
}
