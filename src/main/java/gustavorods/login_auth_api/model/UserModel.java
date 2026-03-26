package gustavorods.login_auth_api.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "users")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String password;
    private String email;
}
