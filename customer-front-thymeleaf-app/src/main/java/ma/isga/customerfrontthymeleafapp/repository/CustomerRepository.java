package ma.isga.customerfrontthymeleafapp.repository;

import ma.isga.customerfrontthymeleafapp.entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
