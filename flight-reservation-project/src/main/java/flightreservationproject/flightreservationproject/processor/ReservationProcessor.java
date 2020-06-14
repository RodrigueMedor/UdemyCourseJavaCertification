package flightreservationproject.flightreservationproject.processor;

import flightreservationproject.flightreservationproject.domain.Reservation;
import flightreservationproject.flightreservationproject.dto.ReservationRequest;
import flightreservationproject.flightreservationproject.service.ReservationService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationProcessor implements Processor {
    @Autowired
    private ReservationService reservationService;

    @Override
    public void process(Exchange exchange) throws Exception {
        reservationService.bookFlight(exchange.getIn().getBody(ReservationRequest.class));
    }
}
