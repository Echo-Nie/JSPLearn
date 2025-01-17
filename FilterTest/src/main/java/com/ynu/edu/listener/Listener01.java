package com.ynu.edu.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName Listener01
 * @Description 监听器01号
 * @Author Echo-Nie
 * @Date 2025/1/17 23:04
 * @Version V1.0
 */
@WebListener
public class Listener01 implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session Created...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroy...");
    }
}
