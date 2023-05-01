package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Conveyancing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConveyancingRepository extends JpaRepository<Conveyancing, Long> {
    List<Conveyancing> findConveyancesByClientIndividualJurisdiction(String jurisdiction);

}
