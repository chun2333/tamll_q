/*
 * FileName: CategoryDTO
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.dto;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 分类信息DTO类<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */
@Data
@TableName("category")
@Builder
public class CategoryDTO {

    @TableField(value = "name")
    private String name;
    @TableId(value = "id")
    private int id;
//    List<ProductDTO> products;
//    List<List<ProductDTO>> productsByRow;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
