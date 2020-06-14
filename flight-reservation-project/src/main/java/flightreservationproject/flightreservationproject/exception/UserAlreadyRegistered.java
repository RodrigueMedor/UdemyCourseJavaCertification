package flightreservationproject.flightreservationproject.exception;

public class UserAlreadyRegistered extends RuntimeException{

    public UserAlreadyRegistered(String message){
        super(message);
    }
}
