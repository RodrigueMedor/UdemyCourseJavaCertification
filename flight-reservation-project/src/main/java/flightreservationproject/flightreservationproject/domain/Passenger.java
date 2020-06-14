package flightreservationproject.flightreservationproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Passenger extends AbstractEntity {

    private String firstname;
    private String lastname;
    private String middlename;
    private String email;
    private String phone;
}
