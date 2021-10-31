package io.security.basic.security.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

//@Configuration
//@EnableWebSecurity
public class SecurityConfigTemp extends WebSecurityConfigurerAdapter {

//	@Autowired
//	UserDetailsService userDetailsService;
	

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("user").password("{noop}1111").roles("USER");
//		auth.inMemoryAuthentication().withUser("sys").password("{noop}1111").roles("SYS","USER");
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}1111").roles("ADMIN","SYS","USER");
//	}



	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.anyRequest().permitAll();
//				.antMatchers("/login").permitAll()
//				.antMatchers("/user").hasRole("USER")
//				.antMatchers("/admin/pay").hasRole("ADMIN")				
//				.antMatchers("/admin/**").access("hasRole('ADMIN') or hasRole('SYS')")
//				.anyRequest().authenticated();
		http
				.formLogin();
//				.successHandler(new AuthenticationSuccessHandler() {
//					
//					@Override
//					public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//							Authentication authentication) throws IOException, ServletException {
//						
//						RequestCache requestCache = new HttpSessionRequestCache();
//						SavedRequest savedRequest = requestCache.getRequest(request, response);
//						String redirectUrl = savedRequest.getRedirectUrl();
//						response.sendRedirect(redirectUrl);
//					}
//				});
//				.loginPage("/loginPage")
//				.defaultSuccessUrl("/")
//				.failureUrl("/login")
//				.usernameParameter("userId")
//				.passwordParameter("passwd")
//				.loginProcessingUrl("/login_proc")
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
//				.permitAll();
		
//		http
//				.logout()
//				.logoutUrl("/logout")
//				.logoutSuccessUrl("/login")
//				.addLogoutHandler(new LogoutHandler() {
//					
//					@Override
//					public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
//						
//						HttpSession session = request.getSession();
//						session.invalidate();
//					}
//				})
//				.logoutSuccessHandler(new LogoutSuccessHandler() {
//					
//					@Override
//					public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
//							throws IOException, ServletException {
//
//						System.out.println("logout");
//						response.sendRedirect("/login");
//					}
//				})
//				.deleteCookies("remember-me")
//		.and()
//				.rememberMe()
//				.rememberMeParameter("remember")
//				.tokenValiditySeconds(3600)
//				.userDetailsService(userDetailsService);
		
//		.and()
//				.sessionManagement()
//				.maximumSessions(1)
//				.maxSessionsPreventsLogin(false);
				
//		http
//				.sessionManagement()
//				.sessionFixation().changeSessionId();
//				.maximumSessions(1)
//				.maxSessionsPreventsLogin(false);
		
//		http
//				.exceptionHandling()
//				.authenticationEntryPoint(new AuthenticationEntryPoint() {
//					
//					@Override
//					public void commence(HttpServletRequest request, HttpServletResponse response,
//							AuthenticationException authException) throws IOException, ServletException {
//					
//						response.sendRedirect("/login");
//					}
//				})
//				.accessDeniedHandler(new AccessDeniedHandler() {
//					
//					@Override
//					public void handle(HttpServletRequest request, HttpServletResponse response,
//							AccessDeniedException accessDeniedException) throws IOException, ServletException {
//
//						response.sendRedirect("/denied");
//					}
//				});
		
//		http
//				.csrf();
	}
}
