package box.organizer.box_organizer.repository;

import box.organizer.box_organizer.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface  AddressRepository extends JpaRepository<Address, UUID> {
        public Address findByCity(String city);

        public Address findByStreet(String street);
}

