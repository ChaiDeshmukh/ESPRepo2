package com.okta.starter;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@EnableOAuth2Sso
@SpringBootApplication
@ComponentScan(basePackages = {"com.okta.controller"})
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	/*@GetMapping("/")
    public String echoTheUsersEmailAddress(Principal principal) {
        //return "Hey there! Your email address is: " + principal.getName();
		return "redirect:/index";
    }*/

}