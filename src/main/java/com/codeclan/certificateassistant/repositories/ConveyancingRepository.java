package com.codeclan.certificateassistant.repositories;

import com.codeclan.certificateassistant.models.Conveyancing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConveyancingRepository extends JpaRepository<Conveyancing, Long> {
    List<Conveyancing> findConveyancesByClientJurisdictionAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(String jurisdiction, String clientType, double min, double max, boolean residential);
    List<Conveyancing> findConveyancesByClientJurisdictionNotInAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(List<String> jurisdiction, String clientType, double min, double max, boolean residential);
//    List<Conveyancing> findConveyancesByClientOwnershipJurisdictionsAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(String jurisdiction, String clientType, double min, double max, boolean residential);

    List<Conveyancing> findConveyancesByClientInOwnershipJurisdictions(List<String> country);
}
