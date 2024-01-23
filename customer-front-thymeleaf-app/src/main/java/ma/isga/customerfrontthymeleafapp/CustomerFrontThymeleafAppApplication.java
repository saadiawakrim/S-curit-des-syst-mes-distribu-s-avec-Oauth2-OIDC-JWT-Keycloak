package ma.isga.customerfrontthymeleafapp;

import ma.isga.customerfrontthymeleafapp.entites.Customer;
import ma.isga.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
          customerRepository.save(Customer.builder().name("Saadia").email("saadia@gmail.com").build());
            customerRepository.save(Customer.builder().name("wakrim").email("wakrim@gmail.com").build());
            customerRepository.save(Customer.builder().name("aya").email("aya@gmail.com").build());
        };
    }
}
