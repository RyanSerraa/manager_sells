package box.organizer.box_organizer.resources;

import box.organizer.box_organizer.entity.Product;
import box.organizer.box_organizer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

    @Autowired
    ProductService service;

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return ResponseEntity.status(201).body(service.saveProduct(product));
    }

    @GetMapping("name")
    public ResponseEntity<Product> findByName(@RequestParam String name){
        return  ResponseEntity.ok().body(service.findByName(name));
    }

    @GetMapping("date")
    public ResponseEntity<Product> findByDate(@RequestParam Date date){
        return ResponseEntity.ok().body(service.findByDate(date));
    }


}
