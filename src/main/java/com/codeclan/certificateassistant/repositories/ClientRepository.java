package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
