package ie.atu.cicd1_exam_friday1.ErrorHandling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<FieldError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        ex.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = error.getDeField();
            String errorMessage = error.getDefaultMessage();
            FieldError fieldError = new FieldError(fieldName, fieldName, errorMessage);
            return new ResponseEntity<>(fieldError, HttpStatus.BAD_REQUEST);
        });
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
