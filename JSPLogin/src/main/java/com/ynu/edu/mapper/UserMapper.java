package com.ynu.edu.mapper;

import com.ynu.edu.entity.User;

public interface UserMapper {
    User queryUserByName(String userName);
}