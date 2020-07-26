package com.qr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 测试第一个
     * @param environment
     * @return
     */
    @Bean
    public Docket docket(Environment environment){
        //在那个环境下有效
        Profiles profiles = Profiles.of("dev");
        boolean files = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("基础-foundation")
                .apiInfo(this.apiInfo())
                .enable(files)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qr.foundation")) //扫描包
//                .paths(PathSelectors.ant("foundation/**")) //过滤扫描包
                .build();
    }
    /**
     * 测试第四个
     * @param environment
     * @return
     */
    @Bean
    public Docket docket1(Environment environment){
        //在那个环境下有效
        Profiles profiles = Profiles.of("dev");
        boolean files = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("框架-frame")
                .apiInfo(this.apiInfo())
                .enable(files)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qr.frame")) //扫描包
//                .paths(PathSelectors.ant("frame/**")) //过滤扫描包
                .build();
    }
    /**
     * 测试第三个
     * @param environment
     * @return
     */
    @Bean
    public Docket docket2(Environment environment){
        //在那个环境下有效
        Profiles profiles = Profiles.of("dev");
        boolean files = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("测试-foundation")
                .apiInfo(this.apiInfo())
                .enable(files)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.qr.entity")) //扫描包
//                .paths(PathSelectors.ant("entity/**")) //过滤扫描包
                .build();
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("项目集成")
                .description("测试")
                .version("v1.0")
                .build();
    }

}
