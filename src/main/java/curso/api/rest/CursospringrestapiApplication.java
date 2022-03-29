package curso.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})
@ComponentScan(basePackages = {"curso.*"})
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})
@EnableTransactionManagement
@RestController
public class CursospringrestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursospringrestapiApplication.class, args);
        //System.out.println(new BCryptPasswordEncoder().encode("123")); //Digite a senha escolhida para gerar o padrão
    }
    /*Para obter uma senha no padrão do JWT adicione um brake point na linha dos sysout acima
    e execute, quando a execução chegar brake point precine F8 que a senha será gerada e
    exibida no console. Este é o padrão de senha que deve ser cadastrado no banco*/
}
