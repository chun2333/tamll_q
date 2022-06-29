/*
 * FileName: Page
 * Author: qiantianchun
 * Date: 2022/6/29
 * Description: //模块目的、功能描述
 * History: //修改记录
 * <author> <time> <version> <desc>
 * 修改人姓名 修改时间 版本号 描述
 */
package com.example.tamll_q.util;

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
public class Page implements Serializable {

    int start;
    int count;
    int total;
    String param;

    public Page(int start, int count) {
        super();
        this.start = start;
        this.count = count;
    }

    public boolean isHasPreviouse() {
        if (start == 0)
            return false;
        return true;

    }

    public boolean isHasNext() {
        if (start == getLast())
            return false;
        return true;
    }

    public int getTotalPage() {
        int totalPage;
        // 假设总数是50，是能够被5整除的，那么就有10页
        if (0 == total % count)
            totalPage = total / count;
            // 假设总数是51，不能够被5整除的，那么就有11页
        else
            totalPage = total / count + 1;

        if (0 == totalPage)
            totalPage = 1;
        return totalPage;

    }

    public int getLast() {
        int last;
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
        if (0 == total % count)
            last = total - count;
            // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
        else
            last = total - total % count;

        last = last < 0 ? 0 : last;
        return last;
    }
}
