package com.ynu.edu.entity;

/**
 * @ClassName User
 * @Description 用户类
 * @Author Echo-Nie
 * @Date 2025/1/17 2:28
 * @Version V1.0
 */
public class User {
    private Integer userId;
    private String userName;
    private String pwd;
    private int age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
