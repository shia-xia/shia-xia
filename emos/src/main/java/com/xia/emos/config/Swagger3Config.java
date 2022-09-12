package com.xia.emos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @Author XJY
 * @Description //Swagger3配置类，直接打开项目url/doc.html--kinfe4j地址
 * @Date 17:32 2022/9/9
 * @Param
 * @return
 **/
@Configuration
@EnableOpenApi
public class Swagger3Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30)
                .select()
//                需要扫描的包,一定要配置，否则swagger无法识别接口
                .apis(RequestHandlerSelectors.basePackage("com.xia.emos.controller"))
                .paths(PathSelectors.any())
                .build()
//                接口的描述信息
                .apiInfo(new ApiInfoBuilder()
                    .title("微信小程序Emos系统接口管理文档：")
                    .description("用于微信小程序开发测试接口的管理")
                    .contact (new Contact("夏璟源","com.xia","328916326@qq.com"))
                    .version("1.0")
                    .build());
    }
}