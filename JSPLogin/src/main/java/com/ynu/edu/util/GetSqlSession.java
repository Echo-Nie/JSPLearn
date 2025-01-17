package com.ynu.edu.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName GetSqlSession
 * @Description 获取数据库session
 * @Author Echo-Nie
 * @Date 2025/1/17 2:44
 * @Version V1.0
 */
public class GetSqlSession {
    public static SqlSession createSqlSession() {
        SqlSessionFactory sqlSessionFactory = null;
        InputStream inpute = null;
        SqlSession session = null;
        try {
            String resource = "mybatis-config.xml";
            inpute = Resources.getResourceAsStream(resource);
            if (inpute == null) {
                System.err.println("无法加载 mybatis-config.xml 文件！");
                return null;
            }
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inpute);
            session = sqlSessionFactory.openSession();
            return session;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (inpute != null) {
                try {
                    inpute.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(createSqlSession());
    }
}
