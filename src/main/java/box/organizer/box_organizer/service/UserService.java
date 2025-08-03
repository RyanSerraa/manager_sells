package box.organizer.box_organizer.service;

import box.organizer.box_organizer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import box.organizer.box_organizer.repository.UserRepository;

@Service
public class UserService {
    UserRepository repository;
    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findByName(String name){
        return repository.findByName(name);
    }

    public User saveUsers(User user){
        return repository.save(user);
    }

}
