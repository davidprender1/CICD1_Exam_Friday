package ie.atu.cicd1_exam_friday1.ErrorHandling;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class VehicleService {
    private final list<Vehicle> vehcile = new ArrayList<>();
    private long counter = 0;

    public List<Vehicle> getAll(){
        return vehicle;
    }

    public Optional<Vehicle>getByregID(long id){
        return Vehicle.stream()
                .filter (v.getID()== id)
                .findfirst();
    }

    public Vehicle create (Vehicle vehicle){
        vehicle.setID(counter++);
        vehicle.add(vehicle);
        return vehicle;
    }

    public Vehicle update (long id, Vehicle vehicle){
        return getbyID(id).map(existing{
            existing.setdriverName(update.getdriverName);
            existing.setEmail(update.getEmail);
            existing.setregNumbere(update.getregNumber);
            return existing;
        });

    }
    public Optional<Vehicle> getByregNumber(String regNumber){

    }

    public boolean delete(long id){
        return vehicle.remove;
    }
}
