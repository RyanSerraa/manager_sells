package box.organizer.box_organizer.resources;

import box.organizer.box_organizer.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import box.organizer.box_organizer.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressResource {

    @Autowired
    AddressService service;

    @PostMapping("/address")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        return ResponseEntity.status(201).body(service.saveAddress(address));
    }

    @GetMapping("/street")
    public ResponseEntity<Address> findByStreet(@RequestParam String street){
        return ResponseEntity.ok().body(service.findByStreet(street));
    }

    @GetMapping("/city")
    public ResponseEntity<Address> findByCity(@RequestParam String city){
        return ResponseEntity.ok().body(service.findByCity(city));
    }


}
