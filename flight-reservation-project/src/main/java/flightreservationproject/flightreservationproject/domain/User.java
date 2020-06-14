package flightreservationproject.flightreservationproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User  extends AbstractEntity {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @ManyToMany
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


}
