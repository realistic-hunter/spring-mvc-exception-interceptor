# TestInterceptor

基于 Spring MVC 的拦截器 + 全局异常处理练习项目。

## 项目简介

这是一个使用 Spring MVC 搭建的 Web 项目，主要用于学习：

- Spring MVC 基础配置
- HandlerInterceptor 拦截器机制
- 登录权限校验
- 全局异常处理
- JSP 页面跳转
- Controller 请求处理流程

项目通过模拟用户登录流程，实现了：

- 未登录禁止访问主页面
- 登录后进入业务页面
- 统一异常处理页面
- 请求拦截与放行机制

---

# 项目功能

## 1. 用户登录

用户通过登录页面输入用户名和密码。

Controller 接收请求后：

- 验证账号密码
- 登录成功后保存 Session
- 跳转到主页面

## 2. 登录拦截

使用 Spring MVC Interceptor 实现权限校验：

- 未登录：禁止访问 main 页面
- 已登录：允许继续访问

核心类：

```text
UserInterceptor.java
```

## 3. 全局异常处理

使用：

```text
@ControllerAdvice
```

统一处理项目中的异常。

例如：

- 算术异常
- 空指针异常
- 运行时异常

异常发生后统一跳转 error 页面。

核心类：

```text
GlobalExceptionHandler.java
```

---

# 项目结构

```text
src
 ├─ main
 │   ├─ java
 │   │   └─ com
 │   │       ├─ controller
 │   │       │    └─ UserController.java
 │   │       ├─ interceptor
 │   │       │    └─ UserInterceptor.java
 │   │       ├─ exception
 │   │       │    └─ GlobalExceptionHandler.java
 │   │       └─ po
 │   │            └─ User.java
 │   │
 │   ├─ resources
 │   │    └─ config
 │   │         └─ springmvc-config.xml
 │   │
 │   └─ webapp
 │        ├─ index.jsp
 │        └─ WEB-INF
 │             ├─ web.xml
 │             └─ jsp
 │                  ├─ login.jsp
 │                  ├─ main.jsp
 │                  └─ error.jsp
```

---

# 技术栈

- Java
- Maven
- Spring MVC
- JSP
- Servlet
- Tomcat

---

# 核心知识点

## Spring MVC 请求流程

项目中涉及：

- DispatcherServlet
- Controller
- Interceptor
- ViewResolver
- JSP 页面渲染

## Interceptor 拦截器

学习内容：

- preHandle
- postHandle
- afterCompletion
- 请求拦截流程
- Session 登录校验

## 全局异常处理

学习内容：

- @ExceptionHandler
- @ControllerAdvice
- ModelAndView
- 统一异常页面

---

# 页面跳转关系

```text
index.jsp
   ↓
login.jsp
   ↓
UserController
   ↓
main.jsp
```

异常发生时：

```text
Controller
   ↓
GlobalExceptionHandler
   ↓
error.jsp
```

---

# 运行方式

## 1. 克隆项目

```bash
git clone https://github.com/你的GitHub用户名/TestInterceptor.git
```

## 2. 使用 IDEA 打开项目

确保安装：

- JDK
- Maven
- Tomcat

## 3. 配置 Tomcat

在 IDEA 中添加本地 Tomcat。

## 4. 启动项目

运行后访问：

```text
http://localhost:8080/TestInterceptor/
```

---

# 项目亮点（简历可写）

- 使用 Spring MVC 完成 Web 项目搭建
- 实现登录拦截与权限校验
- 使用全局异常处理统一管理错误页面
- 理解 MVC 请求处理流程
- 熟悉 JSP + Servlet 开发模式

---

# 后续可扩展方向

可以继续扩展：

- 使用 MyBatis 接入数据库
- 使用 Filter + JWT 实现登录认证
- 接入 Spring Boot
- 前后端分离
- RBAC 权限管理
- 登录注册功能
- 参数校验
- AOP 日志记录

---

# 作者

GitHub：

```text
https://github.com/realistic-hunter
```

