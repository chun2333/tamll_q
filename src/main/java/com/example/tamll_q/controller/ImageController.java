/*
 * FileName: UpLoad
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */
@RestController
@RequestMapping(value = "/image")
public class ImageController extends BaseController {

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/");
    String uploadPath = "/Users/qiantianchun/tamll_q/upload";

    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
    @ResponseBody
    public void upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        JSONObject jsonObject = new JSONObject();
        //1.文件保存地址的后半段目录：  2022/06/29/
        String directory = simpleDateFormat.format(new Date());

        //2.文件保存目录  D:/upload/2022/06/29/   如果目录不存在，则创建
        File dir = new File(uploadPath + directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        //3.文件保存名称（产生的唯一随机数+文件后缀）
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replaceAll("-", "") + suffix;

        //4.创建这个新文件
        File newFile = new File(uploadPath + directory + newFileName);

        //5.文件上传
        try {
            file.transferTo(newFile);
            //可访问url格式：  协议 :// ip地址 ：端口号 / 文件目录(/images/2020/03/15/xxx.jpg)
            String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/upload/" + directory + newFileName;
            jsonObject.put("url", url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
