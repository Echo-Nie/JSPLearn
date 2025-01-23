package com.ynu.edu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ynu.edu.bean.Brand;
import com.ynu.edu.util.JdbcUtil;

/**
 * @ClassName BrandDao
 * @Description 商品类别DAO
 * @Author Echo-Nie
 * @Date 2024/12/9 12:45
 * @Version V1.0
 */
public class BrandDAO {
    /**
     * 列出所有类别
     */
    public List<Brand> listBrands() {
        String sql = "select * from brand";
        List<Brand> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Brand brand = new Brand();
                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                list.add(brand);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return list;
    }

    public boolean insertBrand(Brand brand) {
        String sql = "insert into brand(name) values(?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, brand.getName());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, ps, null);
        }
        return false;
    }

    public Brand getBrandByName(String name) {
        String sql = "select * from brand where `name`=?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtil.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                Brand brand = new Brand();
                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                return brand;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(conn, ps, rs);
        }
        return null;
    }

}
