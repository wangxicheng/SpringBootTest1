http://blog.csdn.net/u012702547/article/details/53740047




Bananer
http://patorjk.com/software/taag
public static void main(String[] args) {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(Test19SpringBoot2Application.class);
    //修改Banner的模式为OFF
    builder.bannerMode(Banner.Mode.OFF).run(args);
}



application.properties中添加如下代码控制日志：
logging.file=/home/sang/workspace/log.log
logging.level.org.springframework.web=debug



Profile配置问题
全局Profile配置我们使用application-{profile}.properties来定义，
然后在application.properties中通过spring.profiles.active来指定使用哪个Profile.

application-prod.properties:
server.port=8081

application-dev.properties:
server.port=8080

然后在application.properties中进行简单配置，如下：
spring.profiles.active=dev
这个表示使用开发环境下的配置。然后运行项目，我们得通过8080端口才可以访问：






