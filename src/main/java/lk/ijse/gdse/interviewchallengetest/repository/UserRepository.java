package lk.ijse.gdse.interviewchallengetest.repository;

import lk.ijse.gdse.interviewchallengetest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    void delete(String uid);
}
