import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Permite acesso a todas as rotas
            )
            .csrf().disable() // Desabilita a proteção contra CSRF (opcional)
            .formLogin().disable(); // Desabilita o formulário de login padrão
        return http.build();
    }
}
    