package com.ynu.po;

/**
 * @ClassName User
 * @Description javaBean
 * @Author Echo-Nie
 * @Date 2024/12/11 23:28
 * @Version V1.0
 */
public class User {
    private Integer userId;
    private String uname;
    private String upwd;

    public User() {
    }

    public User(Integer userId, String uname, String upwd) {
        this.userId = userId;
        this.uname = uname;
        this.upwd = upwd;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }
}
