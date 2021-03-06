package com.etc.delightstouring.utils;

/**
 * @ClassName CounterUtil
 * @Description TODO 生成编号
 * @Author Administrator
 * @Date 20/10/01 12:04
 * @Version 1.0
 **/
public class CounterUtil {
    /**
     * 获得指定位数，根据参数确定位数
     * @param prefix 前缀
     * @param length 位数
     * @param record 第几条记录
     * @return
     */
    public static String getCounterStr(String prefix, int length, int record) {
        return prefix + String.format("%0"+ length +"d", (record+1));
    }
    /** 获得指定位数，默认4位*/
    public static String getCounterStr(String prefix, int record) {
        return prefix + String.format("%04d", (record+1));
    }
}
