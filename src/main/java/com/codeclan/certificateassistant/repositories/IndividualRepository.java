package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Individual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndividualRepository extends JpaRepository<Individual, Long> {
}
