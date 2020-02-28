package br.com.peopleregisted.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import br.com.peopleregisted.model.Usuario;
import br.com.peopleregisted.repository.UsuarioRepository;

@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{

	@Autowired
	private UsuarioRepository usuarioRepository ;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.userDetailsService(userDetailsService())
		.formLogin()
		.defaultSuccessUrl("/pages/pessoa/pessoa.jsf", true).and()
		.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/pages/pessoa/pessoa.jsf")
		.hasRole("ADMIN")
		.anyRequest().authenticated();
		
	}
	
	 @Override
	   protected UserDetailsService userDetailsService() {
		 
		 List<Usuario> usuarios = usuarioRepository.findAll();
		 
		 List<UserDetails> users = new ArrayList<>();
		 
		 for (Usuario u: usuarios){
	      UserDetails user = new User(u.getNome(), u.getSenha(), AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_"+u.getPapel()));
	      users.add(user);
		 }
	      
	      return new InMemoryUserDetailsManager(users);
	   }
}
