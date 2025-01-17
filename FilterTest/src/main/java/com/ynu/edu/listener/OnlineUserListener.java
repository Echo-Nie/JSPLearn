package com.ynu.edu.listener;

import com.ynu.edu.util.OnlineUserCounter;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnlineUserListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // Session 创建时，增加在线人数
        OnlineUserCounter.increment();
        System.out.println("Session 创建，当前在线人数: " + OnlineUserCounter.getOnlineUsers());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // Session 销毁时，减少在线人数
        OnlineUserCounter.decrement();
        System.out.println("Session 销毁，当前在线人数: " + OnlineUserCounter.getOnlineUsers());
    }
}