/*
 * FileName: ProductDTO
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */
@Data
@Builder
public class ProductDTO {
    private String name;
    private String subTitle;
    private float orignalPrice;
    private float promotePrice;
    private int stock;
    private Date createDate;
    private CategoryDTO category;
    private int id;
    private ProductImageDTO firstProductImage;
    private List<ProductImageDTO> productImages;
    private List<ProductImageDTO> productSingleImages;
    private List<ProductImageDTO> productDetailImages;
    private int reviewCount;
    private int saleCount;
}
