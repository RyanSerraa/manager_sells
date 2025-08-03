package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.Date;

@Service
public class ProductService {

    ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findByProduct(String product){
        return repository.findByProduct(product);
    }

    public Product findByDate(Date date){
        return repository.findByDate(date);
    }
    public Product saveProduct(Product product){
      return  repository.save(product);
    }
}
