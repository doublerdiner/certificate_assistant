package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Corporate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateRepository extends JpaRepository<Corporate, Long> {

}
