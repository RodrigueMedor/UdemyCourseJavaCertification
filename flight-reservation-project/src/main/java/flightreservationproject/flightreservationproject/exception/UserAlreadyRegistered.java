package flightreservationproject.flightreservationproject.service;

public class UserAlreadyRegistered extends RuntimeException{

    public UserAlreadyRegistered(String message){
        super(message);
    }
}
