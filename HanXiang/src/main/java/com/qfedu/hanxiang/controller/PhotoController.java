package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.uitl.FileUtils;
import com.qfedu.hanxiang.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @创建人 Fung
 * @创建时间 $date$
 * @描述
 */
@Controller
public class PhotoController {

    //实现文件上传
    @RequestMapping(value="photoupload.do",method= {RequestMethod.POST})
    @ResponseBody
    public Result upload(@RequestParam("f1")MultipartFile mFile, HttpServletRequest request) {

        File dir=FileUtils.createDir(request.getServletContext().getRealPath("/"));
        System.out.println(dir);

        File file=new File(dir,FileUtils.createFileName(mFile.getOriginalFilename()));
        try {
            mFile.transferTo(file);

            return new Result(1,"存储成功",dir.getName()+File.separator+file.getName());

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return new Result(0,"存储失败");
        }


    }

}
