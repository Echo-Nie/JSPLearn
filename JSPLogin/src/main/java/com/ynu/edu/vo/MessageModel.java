package com.ynu.edu.vo;

/**
 * @ClassName MessageModel
 * @Description 消息模型对象，做数据响应的；200表示成功，400表示失败
 *              用字符串表示
 *              回显数据：Object
 * @Author Echo-Nie
 * @Date 2025/1/17 14:11
 * @Version V1.0
 */
public class MessageModel {
    private String code = "200";//状态码，200成功，400失败
    private String msg = "成功";
    private Object object;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
