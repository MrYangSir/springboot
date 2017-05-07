说明：
aop：面向切面编程

注解和xml一样都是元数据，元数据及解释数据，相当于xml配置文件

使用的注解有：
@Aspect 声明一个切面
声明一个切面
@PointCut
切面中所需要的古规则
    @After 执行前面
    @Before 执行后
    @Around

@Transcational 声明一个事务
@Cacheable 声明为数据缓存