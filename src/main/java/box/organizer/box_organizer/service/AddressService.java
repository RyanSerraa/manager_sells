package box.organizer.box_organizer.service;

import box.organizer.box_organizer.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import box.organizer.box_organizer.repository.AddressRepository;

@Service
public class AddressService {
    private AddressRepository repository;

    @Autowired
    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public Address findByStreet(String street){
        return repository.findByStreet(street);
    }

    public Address findByCity(String city){
        return repository.findByCity(city);
    }

    public Address saveAddress(Address address){
        return repository.save(address);
    }
}
