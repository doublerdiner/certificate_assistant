package com.codeclan.certificateassistant.components;

import com.codeclan.certificateassistant.models.*;
import com.codeclan.certificateassistant.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    IndividualRepository individualRepository;
    @Autowired
    CorporateRepository corporateRepository;
    @Autowired
    ConveyancingRepository conveyancingRepository;
    @Autowired
    TCSPRepository tcspRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("Chris");
        userRepository.save(user);
        Individual client1 = new Individual("BA12345", "Aimi Barclay", "", true, false, user, "United Kingdom");
        Individual client2 = new Individual("BA98765", "Chris Barclay", "", true, true, user, "United Kingdom");
        Individual client3 = new Individual("BA00011", "Jim Barclay", "Gambling", false, false, user, "Japan");
        individualRepository.save(client1);
        individualRepository.save(client2);
        individualRepository.save(client3);
        Corporate clientA = new Corporate("BA54321", "Barclay's Bakes", "Cash Intensive", true, false, user, "United Kingdom", new ArrayList<>(), new ArrayList<>(), false);
        Corporate clientB = new Corporate("CA12345", "Carrie's Cafe", "Cash Intensive", true, true, user, "China", new ArrayList<>(), new ArrayList<>(), false);
        Corporate clientC = new Corporate("AT52244", "Atlas Wealth", "", false, false, user, "United Kingdom", new ArrayList<>(), new ArrayList<>(), false);
        Corporate clientD = new Corporate("BA525252", "Barclay Trust", "", true, false, user, "United Kingdom", new ArrayList<>(), new ArrayList<>(), true);
        corporateRepository.save(clientA);
        corporateRepository.save(clientB);
        corporateRepository.save(clientC);
        corporateRepository.save(clientD);
        Conveyancing conveyancing1 = new Conveyancing("0001", "purchase: 12 Dalhousie Street", client1, 1200, LocalDate.now(), 290000, 50000, true);
        Conveyancing conveyancing2 = new Conveyancing("0002", "purchase: 14 Dalhousie Street", client1, 1200, LocalDate.now(), 290000, 50000, true);
        Conveyancing conveyancing3 = new Conveyancing("0003", "purchase: 16 Dalhousie Street", client1, 1200, LocalDate.now(), 290000, 50000, true);
        Conveyancing conveyancing4 = new Conveyancing("0001", "", client2, 1200, LocalDate.now(), 290000, 180000, true);
        Conveyancing conveyancing5 = new Conveyancing("0001", "", client3, 2000, LocalDate.now(), 1500000, 200000, false);
        Conveyancing conveyancing6 = new Conveyancing("0003", "", client3, 2000, LocalDate.now(), 1500000, 200000, false);
        conveyancingRepository.save(conveyancing1);
        conveyancingRepository.save(conveyancing2);
        conveyancingRepository.save(conveyancing3);
        conveyancingRepository.save(conveyancing4);
        conveyancingRepository.save(conveyancing5);
        conveyancingRepository.save(conveyancing6);
        TCSP tcsp = new TCSP("0002", "Company Incorporation", clientA, 1500, LocalDate.now(), "Company Incorporation", "United Kingdom", new ArrayList<>());
        tcspRepository.save(tcsp);

    }

}
