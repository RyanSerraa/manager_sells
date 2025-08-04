package box.organizer.box_organizer.resources;

import box.organizer.box_organizer.entity.Address;
import box.organizer.box_organizer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import box.organizer.box_organizer.service.AddressService;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressResource {

    @Autowired
    AddressService service;

    @PostMapping
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        return ResponseEntity.status(201).body(service.saveAddress(address));
    }

    @GetMapping
    public ResponseEntity<List<Address>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
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
