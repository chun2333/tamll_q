/*
 * FileName: CategoryVO
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈功能详细描述〉
 *
 * @author: qiantianchun
 * @date: 2022/6/29
 */

@Data
public class CategoryVO implements Serializable {
    private String name;
    private int id = -1;
}
