bean的初始化和销毁
在使用bean前面或者使用之后做一些操作

初始化bean的方式用两种，java配置，和注解配置
java配置
@Bean的initMethod和destroyMethod(相当于xml中的init-method,destroy-method)

注解配置
@Bean 需要利用JSR250的@postConstruct和@preDestroy两个注解进行配置