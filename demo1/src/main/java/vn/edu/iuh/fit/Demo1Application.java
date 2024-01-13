package vn.edu.iuh.fit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.repositories.UserRepository;

@SpringBootApplication
public class Demo1Application {
    @Autowired
private UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
    @Bean
    CommandLineRunner test(){
        return  args -> {
            System.out.println(userRepository.findAll());
        };
    }

}
