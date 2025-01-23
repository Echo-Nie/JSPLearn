package com.ynu.edu.bean;

/**
 * @ClassName Brand
 * @Description 商品类别
 * @Author Echo-Nie
 * @Date 2024/12/9 12:24
 * @Version V1.0
 */
public class Brand {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand [id=" + id + ", name=" + name + "]";
    }

}
