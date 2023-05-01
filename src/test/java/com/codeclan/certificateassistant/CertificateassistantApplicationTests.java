package com.codeclan.certificateassistant;

import com.codeclan.certificateassistant.models.Conveyancing;
import com.codeclan.certificateassistant.repositories.ConveyancingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CertificateassistantApplicationTests {
	@Autowired
	ConveyancingRepository conveyancingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAnswerQ31(){
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientJurisdictionAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential("United Kingdom", "Individual", 100000, 1000000, true);
		System.out.println(conveyances);
	}
	@Test
	public void canAnswerQ32(){
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientJurisdictionNotInAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(Arrays.asList("United Kingdom"), "Individual", 100000, 1000000, true);
		System.out.println(conveyances);
	}
	@Test
	public void canAnswerQ33(){
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientJurisdictionAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential("United Kingdom", "Corporate", 100000, 1000000, true);
		System.out.println(conveyances);
	}
	@Test
	public void canAnswerQ34(){
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientJurisdictionNotInAndClientClientTypeAndPricePaidGreaterThanEqualAndPricePaidLessThanAndResidential(Arrays.asList("United Kingdom"), "Corporate", 100000, 1000000, true);
		System.out.println(conveyances);
	}
	@Test
	public void canAnswerQ35(){
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientInOwnershipJurisdictions(Arrays.asList("Germany"));
		System.out.println(conveyances);
	}


}
