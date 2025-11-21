package ie.atu.cicd1_exam_friday1;

import ie.atu.cicd1_exam_friday1.ErrorHandling.Vehicle;
import org.apache.catalina.Service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleServiceTest {
    private Vehicle vehicle;
    @BeforeEach
    public void setUp() {
        Service newService = new Service();
        vehicle = newService.create(vehicle);
    }

    @Test
    public void findByReg(){
        vehicle. v = Vehicle.builder()
        .RegNumber("191-G-12345");
        .driverName("Sarah");
        .email("Sarah@atu.ie");
        .passenger(5);
        .build();
        service.create(v);

        Optional<V>found = Service.findByReg("191-G-12345")
                assertTrue(found.is.present());
        assertEquals("Sarah", foundget().getDriverName());
    }

    @Test
    public void duplicate RegThrows(){
        vehicle. v = Vehicle.builder()
                .RegNumber("145-N-12345");
        .driverName("John");
        .email("John@atu.ie");
        .passenger(2);
        .build();

        assertThrows

    }



}
