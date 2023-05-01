package com.codeclan.certificateassistant;

import com.codeclan.certificateassistant.models.Conveyancing;
import com.codeclan.certificateassistant.models.Individual;
import com.codeclan.certificateassistant.models.User;
import com.codeclan.certificateassistant.repositories.ConveyancingRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
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
		List<Conveyancing> conveyances = conveyancingRepository.findConveyancesByClientIndividualJurisdiction("United Kingdom");
		System.out.println(conveyances);
	}

}
