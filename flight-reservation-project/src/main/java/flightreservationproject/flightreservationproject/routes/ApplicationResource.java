package flightreservationproject.flightreservationproject.routes;

import flightreservationproject.flightreservationproject.repositories.ReservationRepository;
import flightreservationproject.flightreservationproject.service.ReservationService;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class ApplicationResource extends RouteBuilder {
    @Autowired
    private ReservationService reservationService;

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);

        rest().get("/reservations/{id}").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(()->reservationService.bookFlight(reservationRepository.findById()))
    }
}
