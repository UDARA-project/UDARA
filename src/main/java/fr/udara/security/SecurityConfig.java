package fr.udara.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Udara
 *
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/** customUserDetailsService : UserDetailsService */
	@Autowired
	@Qualifier("customUserDetailsService")
	private UserDetailsService customUserDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//	    http.csrf()
//	    .disable()
//		.authorizeRequests()
//		.antMatchers("/")
//		.permitAll()
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin()
//		.loginPage("/login")
//		.defaultSuccessUrl("/welcome")
//		.failureUrl("/login?error=true")
//		.permitAll()
//		.and()
//		.logout()
//		.deleteCookies("JSESSIONID")
//		.logoutUrl("/logout")
//		.logoutSuccessUrl("/login"); 

//		 http.authorizeRequests()
//         .antMatchers("/securityNone").permitAll()
//         .anyRequest().authenticated()
//         .and()
//         .httpBasic();

	}

	@Override
	public void configure(WebSecurity http) throws Exception {
		http.ignoring().antMatchers("/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
		authManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

}
