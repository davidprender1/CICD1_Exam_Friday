package ie.atu.cicd1_exam_friday1.ErrorHandling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Vehicle {

    private Long id;

    @NotBlank(message = "Driver Name cannot be Blank")
    private String driverName;

    @Notblank ( message = "Email cannot be blank")
    @Email
    private String email;

    @Pattern(regexp = "\\d[0-9]{2,3}-[A-Z]{1,2}-[0-9]{1,6}]", message = "Reg number cannot be blank")
    private String regNumber;

    @Min (value = 1, message = " Passenger must be more than 1")
    @Max (value = 7, message = " Passenger must not be more than 7")
    private int passengers;




}
