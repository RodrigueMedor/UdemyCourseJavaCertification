package flightreservationproject.flightreservationproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role extends AbstractEntity {
       // implements GrantedAuthority {

    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
//    @Override
//    public String getAuthority() {
//        return name;
//    }


}
