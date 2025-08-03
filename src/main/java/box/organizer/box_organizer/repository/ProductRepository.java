package box.organizer.box_organizer.repository;

import box.organizer.box_organizer.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    public Product findByName(String name);
    public Product findByDate(Date date);
}
