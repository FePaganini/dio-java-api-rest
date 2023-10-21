package paganini.felipe.api.rest.bootcamp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import paganini.felipe.api.rest.bootcamp.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
