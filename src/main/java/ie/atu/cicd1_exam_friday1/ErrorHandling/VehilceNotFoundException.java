package ie.atu.cicd1_exam_friday1.ErrorHandling;

public class VehilceNotFoundException extends RuntimeException {
    public PassengerNotFoundException(String message){
        super(message);
    }
}
