package flightreservationproject.flightreservationproject.repositories;

import flightreservationproject.flightreservationproject.domain.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
