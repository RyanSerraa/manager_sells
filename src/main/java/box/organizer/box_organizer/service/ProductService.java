package box.organizer.box_organizer.service;

import box.organizer.box_organizer.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import box.organizer.box_organizer.repository.ProductRepository;

import java.util.Date;

@Service
public class ProductService {

    ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findByProduct(String name){
        return repository.findByName(name);
    }

    public Product findByDate(Date date){
        return repository.findByDate(date);
    }
    public Product saveProduct(Product product){
      return  repository.save(product);
    }
}
