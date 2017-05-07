@Scope 描述如何创建bean的实例

@scope 注解实现的几种方式

Singleton 一个容器中只有一个bean，默认配置，全局容器共享一个实例
prototype 每次调用都创建一个bean实例
request 每次请求都创建一个bean实例
session 每个session都创建一个bean实例
globalSession 每个global session都创建一个bean

