package ie.atu.cicd1_exam_friday1.ErrorHandling;

public class DuplicateException extends RuntimeException {
    public DuplicateException(String message){
        super(message);
    }
}
