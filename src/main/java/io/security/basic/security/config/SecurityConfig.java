package io.security.basic.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.anyRequest().authenticated();
		http
				.formLogin()
				//.loginPage("/loginPage")
				.defaultSuccessUrl("/")
				.failureUrl("/login")
				.usernameParameter("userId")
				.passwordParameter("passwd")
				.loginProcessingUrl("/login_proc")
//				.successHandler(new AuthenticationSuccessHandler() {
//					
//					@Override
//					public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//							Authentication authentication) throws IOException, ServletException {
//						
//						System.out.println("authentication : " + authentication.getName());
//						response.sendRedirect("/");
//					}
//				})
//				.failureHandler(new AuthenticationFailureHandler() {
//					
//					@Override
//					public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
//							AuthenticationException exception) throws IOException, ServletException {
//						
//						System.out.println("exception : " + exception.getMessage());
//						response.sendRedirect("/login");
//					}
//				})
				.permitAll();
		
	}

	
}
