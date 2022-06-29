/*
 * FileName: ProductImageDTO
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.dto;

import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */

@Data
@Builder
public class ProductImageDTO {

    private String type;
    private ProductDTO product;
    private int id;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
