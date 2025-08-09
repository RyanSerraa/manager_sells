package box.organizer.box_organizer.service;

import box.organizer.box_organizer.entity.Address;
import box.organizer.box_organizer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import box.organizer.box_organizer.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    UserRepository repository;
    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll(){ return repository.findAll();}

    public User findByName(String name){return repository.findByName(name);}

    public User findByEmail(String email){
        return repository.findByEmail(email);
    }
    public User update(String name, User updatedUser) {
        User user = repository.findByName(name);
        if(user != null){
            user.setName(updatedUser.getName());
            User existingUserWithEmail = repository.findByEmail(updatedUser.getEmail());
            if (existingUserWithEmail == null || existingUserWithEmail.getId().equals(user.getId())) {
                user.setEmail(updatedUser.getEmail());
            }
            return repository.save(user);
        }
        return null;
    }

    public User login(String email, String password) {
        User user = findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public User saveUsers(User user){
        return repository.save(user);
    }

}
