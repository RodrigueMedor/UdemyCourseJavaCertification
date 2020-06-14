package flightreservationproject.flightreservationproject.service;

import flightreservationproject.flightreservationproject.domain.Reservation;
import flightreservationproject.flightreservationproject.dto.ReservationRequest;

public interface ReservationService {
    public Reservation bookFlight(ReservationRequest reservationRequest);
}
