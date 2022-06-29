/*
 * FileName: BaseController
 * Author: qiantianchun
 * Date: 2022/3/6
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/3/6
 */
public class BaseController {

    public void ajax(HttpServletResponse response, String content) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write(content);
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String toJsonNullListString(Object object) {
        return JSON.toJSONString(object, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty,
                SerializerFeature.WriteNullListAsEmpty, SerializerFeature.DisableCircularReferenceDetect);
    }
}
