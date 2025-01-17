package com.ynu.edu.util;

/**
 * @ClassName StringUtil
 * @Description 字符串工具类
 * @Author Echo-Nie
 * @Date 2025/1/17 14:43
 * @Version V1.0
 */
public class StringUtil {
    /**
    * @Author Echo-Nie
    * @Description 判断是否为空
    * @Date 14:44 2025/1/17
    * @Param [str]
    * @return boolean
    **/
    public static boolean isEmpty(String str){
        if(str==null||"".equals(str.trim())){
            return true;
        }
        return false;
    }
}
