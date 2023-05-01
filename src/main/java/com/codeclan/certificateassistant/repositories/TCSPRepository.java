package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.TCSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCSPRepository extends JpaRepository<TCSP, Long> {
}
