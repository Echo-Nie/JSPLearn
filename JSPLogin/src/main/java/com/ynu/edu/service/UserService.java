package com.ynu.edu.service;

import com.ynu.edu.entity.User;
import com.ynu.edu.mapper.UserMapper;
import com.ynu.edu.util.GetSqlSession;
import com.ynu.edu.util.StringUtil;
import com.ynu.edu.vo.MessageModel;
import org.apache.ibatis.session.SqlSession;

/**
 * @ClassName UserService
 * @Description 登录页面的业务逻辑层
 * @Author Echo-Nie
 * @Date 2025/1/17 14:14
 * @Version V1.0
 */
public class UserService {
    /**
    * @Author Echo-Nie
    * @Description
    1. 参数的非空判断
        if NULL：状态码、提示信息、回显数据设置到MessageModel中，return
    2. 调用dao层查询方法，通过uname查询用户对象
    3. 判断用户对象是否为空
        状态码、提示信息、回显数据设置到MessageModel中，return
    4. 判断数据库中查询的和前台的uname和pwd进行对比
    5. 登录成功：将success状态、提示信息、用户对象舍之道MessageModel对象中，return

    * @Date 14:43 2025/1/17
    * @Param [uname, upwd]
    * @return com.ynu.edu.vo.MessageModel
    **/
    public MessageModel userLogin(String uname, String upwd) {
        MessageModel messageModel = new MessageModel();
//        数据回显
        User u = new User();
        u.setUserName(uname);
        u.setPwd(upwd);
        messageModel.setObject(u);

//        1. 参数的非空判断
        if(StringUtil.isEmpty(uname)||StringUtil.isEmpty(upwd)){
//            if NULL：状态码、提示信息、回显数据设置到MessageModel中，return
            messageModel.setCode("400");
            messageModel.setMsg("用户名和密码不能为空！！");

        }
//        2. 调用dao层查询方法，通过uname查询用户对象
        SqlSession session = GetSqlSession.createSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.queryUserByName(uname);
//        3. 判断用户对象是否为空
        if(user==null){
            messageModel.setCode("400");
            messageModel.setMsg("用户不存在");
            return messageModel;
        }
//        4. 判断数据库中查询的和前台的uname和pwd进行对比
        if(!upwd.equals(user.getPwd())){
            messageModel.setCode("400");
            messageModel.setMsg("密码错误！");
            return messageModel;
        }
        messageModel.setObject(user);

        return messageModel;
    }
}
