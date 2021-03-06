package com.testowanie.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.
			authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/movie").permitAll()
				.antMatchers("/movie/*").permitAll()
				.antMatchers("/episode").permitAll()
				.antMatchers("/episode/*").permitAll()
				.antMatchers("/movieReview").permitAll()
				.antMatchers("/movieReview/*").permitAll()
				.antMatchers("/episodeReview").permitAll()
				.antMatchers("/episodeReview/*").permitAll()
				.and().csrf().disable();
	}
}