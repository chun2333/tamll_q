/*
 * FileName: CategoryDao
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.tamll_q.dto.CategoryDTO;
import com.example.tamll_q.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */
@Component
public class CategoryDao {

    @Autowired
    CategoryMapper categoryMapper;

    public List<CategoryDTO> queryAllInfo(Integer id){
        QueryWrapper<CategoryDTO> qw = new QueryWrapper<>();
        qw.eq("id", id);
        return categoryMapper.selectList(qw);
    }

    public int add(CategoryDTO dto){
            return categoryMapper.insert(dto);
    }
}
