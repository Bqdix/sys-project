package net.bqdix.sys.repos;

import net.bqdix.sys.objects.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}