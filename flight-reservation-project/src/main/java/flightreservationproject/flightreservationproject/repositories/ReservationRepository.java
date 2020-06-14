package flightreservationproject.flightreservationproject.repositories;

import flightreservationproject.flightreservationproject.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
