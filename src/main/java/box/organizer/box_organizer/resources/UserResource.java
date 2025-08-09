package box.organizer.box_organizer.resources;

import box.organizer.box_organizer.entity.User;
import box.organizer.box_organizer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserResource {
    @Autowired
    UserService service;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.status(201).body(service.saveUsers(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/name")
    public ResponseEntity<User> findByName(@RequestParam String name){
        return ResponseEntity.ok().body(service.findByName(name));
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDTO userDTO){
        User user = service.login(userDTO.email(), userDTO.password());
        if(user == null){
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.ok(user);
    }

    private record UserDTO( String email, String password){}
}
