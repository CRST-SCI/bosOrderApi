package com.crst.sci.bosOrderApi.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Rohit
 *
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

	/**
	 * @return
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.crst.sci.bosOrderApi.controller"))
				.paths(PathSelectors.any())
				.build();
				//.apiInfo(metaInfo());
	}
	
	/**
	 * @return
	 */
	/*private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Bos Order Api's", "Bos Order Api's for CRST-SCI", "2.7.0", 
				"Terms of Service", new Contact("CRST", "https://www.crst.com/contact/", "info@crst.com"), 
				"Apache License", "https://swagger.io/");
		
		return apiInfo;
	}*/

}
