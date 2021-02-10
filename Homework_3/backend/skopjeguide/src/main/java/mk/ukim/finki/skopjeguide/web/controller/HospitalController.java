package mk.ukim.finki.skopjeguide.web.controller;


import mk.ukim.finki.skopjeguide.repository.HospitalRepository;
import mk.ukim.finki.skopjeguide.repository.RestaurantRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospitals")
@CrossOrigin("*")
public class HospitalController {

    private HospitalRepository repository;

    public HospitalController(HospitalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity getAllHospitals() {
        return ResponseEntity.ok(this.repository.findByNameNotNull());
    }
}
