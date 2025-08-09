package box.organizer.box_organizer.repository;

import box.organizer.box_organizer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    public User findByName(String name);

    public User findByEmail(String email);
}
