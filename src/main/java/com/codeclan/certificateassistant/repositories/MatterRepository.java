package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatterRepository extends JpaRepository<Matter, Long> {

}
