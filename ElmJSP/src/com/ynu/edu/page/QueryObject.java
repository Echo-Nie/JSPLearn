package com.ynu.edu.page;

/**
 * @ClassName QueryObject
 * @Description 查询
 * @Author Echo-Nie
 * @Date 2024/12/9 13:45
 * @Version V1.0
 */
public class QueryObject {
    private String keyword;
    private Integer brandId;
    private Integer currentPage = 1;
    private Integer pageSize = 4;

    public QueryObject() {

    }

    public QueryObject(String keyword, Integer brandId) {
        this.keyword = keyword;
        this.brandId = brandId;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getKeyword() {
        return keyword;
    }

    public Integer getBrandId() {
        return brandId;
    }
}
