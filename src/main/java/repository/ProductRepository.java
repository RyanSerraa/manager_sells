package repository;

import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    public Product findByProduct(String product);
    public Product findByDate(Date date);
}
