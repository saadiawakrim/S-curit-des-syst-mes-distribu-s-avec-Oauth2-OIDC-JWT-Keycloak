package ma.isga.customerfrontthymeleafapp.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Customer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
