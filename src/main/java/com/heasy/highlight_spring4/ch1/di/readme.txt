说明：spring中的控制翻转(ioc)和依赖注入(DI).
控制翻转是通过Di进行实现的，所谓依赖注入是指容器负责创建对象和维护对象键的依赖关系，而不是通过对象本身负责自己的创建和解决自己的依赖
ioc容器，负责创建bean，并通过容器讲功能类的bean注入到需要的bean中，
spring提供创建和注入bean的方式：xml配置，注解，java配置，groovy配置。

spring中声明bean的注解：
@Component 组件，没有明确的角色
@Service 在业务逻辑层使用
@Controller在表现层中使用(springmvc中提供)
@Repository 在数据访问层使用

注入bean的注解
@Autowired spring 提供的注解
@Inject JSR_330提供的注解
@Resource JSR-250提供的注解

声明配置类
@Configuration 声明当前类是一个配置类,相当于spring的一个xml文件

自动扫描包下的所有声明的注解
@ComponentScan 自动扫描包下的所有声明的注解


@Bean 声明当前方法的返回值是一个bean


全局配置使用java配置，业务bean的配置使用注解配置