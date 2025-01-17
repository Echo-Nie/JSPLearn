# JSPLearn
记录在本科期间学习JSP时候的技术总结以及遇到的问题，后续可能会放入一些项目



Login项目包结构：
com.ynu.edu/
├── controller/
│   ├── LogoutServlet.java
│   └── UserServlet.java
│
├── entity/
│   └── User.java
│
├── mapper/
│   └── UserMapper.java
│
├── service/
│   └── UserService.java
│
├── util/
│   ├── GetSqlSession.java
│   └── StringUtil.java
│
├── vo/
│   └── MessageModel.java
│
├── resources/
│   ├── com.ynu.edu.mapper/
│   │   ├── UserMapper.xml
│   │   └── mybatis-config.xml
│   └── mysql.properties
│
├── webapp/
│   ├── css/
│   ├── js/
│   │   └── jquery-3.4.1.js
│   ├── WEB-INF/
│   │   ├── lib/
│   │   ├── web.xml
│   │   └── index.jsp
│   ├── login.jsp
│   └── M+ 编写逻辑.md
│
└── test/
    ├── java/
    │   └── TestSession.java
    └── resources/
