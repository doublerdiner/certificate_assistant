package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
