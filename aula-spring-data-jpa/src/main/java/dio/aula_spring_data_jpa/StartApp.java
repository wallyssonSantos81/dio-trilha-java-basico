package dio.aula_spring_data_jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Component;
import dio.aula_spring_data_jpa.repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Wallisson");
        user.setName("Wallysson");
        user.setPassword("dio123");

        repository.save(user);

        for(dio.aula_spring_data_jpa.model.User u: repository.findAll()){
            System.out.println(u);
        }
        
    }


}
