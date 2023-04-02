# Spring Boot Web 开发示例

## 介绍

这是一个简单但是比较全面的spring boot框架用于web开发的示例，包含以下内容：

>      序列化(json)输出
>      过滤器(filters)
>      监视器(listener)
>      拦截器(interceptor)
>      日志（基于lombok）
>      properties配置
>      数据库(mysql)
>      ORM
>      单元测试

## 代码目录介绍

```
com
  +- easy
   +-web
     +- common
       +- filter
       |  +- CustomFilter.java                   自定义过滤器
       +- interceptor
       |  +- CustomHandlerInterceptor.java       自定义拦截器
       +- listener
       |  +- CustomRequestListener.java          自定义Request监视器
       |  +- CustomSessionListener.java          自定义Session监视器
       +- AppProperties                          项目配置解析类
     +- model                                    model层
       +- repository                             数据访问
       |  +- UserRepository.java
       +- User.java
     +- controller                                      controller层
       |  +- HelloController.java                入门示例
       |  +- ThymeleafController.java            模块引擎示例
       |  +- UserController.java                 查询用户示例
    +- WebApplication                           启动器
    +- WebConfiguration                         配置入口(配置过滤器、拦截器、监视器）
```
# 应用流程
![Image text](https://github.com/helloworld903/spring-boot-web/blob/main/c1878fa666e4a1d8b993dd70f9ae2a96.png)
