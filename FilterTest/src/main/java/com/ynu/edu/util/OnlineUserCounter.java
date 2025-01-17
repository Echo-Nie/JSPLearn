package com.ynu.edu.util;

import java.util.concurrent.atomic.AtomicInteger;

public class OnlineUserCounter {
    private static final AtomicInteger onlineUsers = new AtomicInteger(0);

    // 增加在线人数
    public static void increment() {
        onlineUsers.incrementAndGet();
    }

    // 减少在线人数
    public static void decrement() {
        onlineUsers.decrementAndGet();
    }

    // 获取当前在线人数
    public static int getOnlineUsers() {
        return onlineUsers.get();
    }
}