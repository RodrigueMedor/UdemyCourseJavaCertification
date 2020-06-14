package flightreservationproject.flightreservationproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reservation extends AbstractEntity {

    private boolean checkedIn;
    private int numberOfbags;
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;
}
