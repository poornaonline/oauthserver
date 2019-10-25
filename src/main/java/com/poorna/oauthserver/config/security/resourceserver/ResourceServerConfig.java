package com.poorna.oauthserver.config.security.resourceserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
 
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
 
	@Override
	public void configure(HttpSecurity http) throws Exception {

		//-- define URL patterns to enable OAuth2 security

//		http.
//		anonymous().disable()
//		.requestMatchers().antMatchers("/api/**", "/admin/**")
//		.and().authorizeRequests()
//		.antMatchers("/api/**").access("hasRole('ADMIN') or hasRole('USER')")
//		.antMatchers("/admin/**").access("hasRole('ADMIN')")
//		.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());

//		We are enabling the method level authentication, so we are disabling Resource level authentication (This just requires to have a user role to access resources)
		http.anonymous().disable()
				.requestMatchers().antMatchers("/api/**", "/admin/**")
				.and().authorizeRequests()
				.antMatchers("/api/**").access("hasRole('USER')")
				.antMatchers("/admin/**").permitAll()
				.and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
	}
	
}