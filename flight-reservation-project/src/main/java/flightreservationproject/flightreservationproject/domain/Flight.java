package flightreservationproject.flightreservationproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.Entity;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Flight extends AbstractEntity {

    private String fligthnumber;
    private String operatingAirlines;
    private String departureCity;
    private String arrivalCity;
    private LocalDate dateOfDeparture;
    private Timestamp estimatedDepartureTime;
}
