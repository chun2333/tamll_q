/*
 * FileName: CategoryController
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.controller;

import com.alibaba.fastjson.JSON;
import com.example.tamll_q.dao.CategoryDao;
import com.example.tamll_q.dto.CategoryDTO;
import com.example.tamll_q.util.Page;
import com.example.tamll_q.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */
@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoryDao categoryDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(HttpServletResponse response, CategoryVO vo) {
        //参数校验
        if (vo == null || vo.getId() < 0) {
            return "false";
        }
        //业务操作
        CategoryDTO dto = CategoryDTO.builder()
                .id(vo.getId())
                .name(vo.getName())
                .build();
        if (categoryDao.add(dto) == 0) {
            return "false";
        } else {
            return "true";
        }
    }
}
