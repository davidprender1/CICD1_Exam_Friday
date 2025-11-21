package ie.atu.cicd1_exam_friday1.ErrorHandling;

import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {



    @GetMapping("/addDriverId")
    public boolean addDriverId(@RequestParam long id){
        return "Driver Id:" + driverId;
    }

    @PostMapping(/"addVehicle")
    public Vehicle create(@RequestBody Vehicle vehicle){
        return vehicle;
    }



}
