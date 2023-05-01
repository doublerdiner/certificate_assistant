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
    ClientRepository clientRepository;
    @Autowired
    ConveyancingRepository conveyancingRepository;
    @Autowired
    TCSPRepository tcspRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        User user = new User("Chris");
        userRepository.save(user);
        Client client1 = new Client("BA12345", "Aimi Barclay", "", "United Kingdom", true, false, new ArrayList<>(), new ArrayList<>(), "Individual", user);
        Client client2 = new Client("BA98765", "Chris Barclay", "", "United Kingdom", true, true, new ArrayList<>(), new ArrayList<>(), "Individual", user);
        Client client3 = new Client("BA00011", "Jim Barclay", "Gambling", "Japan", false, false, new ArrayList<>(), new ArrayList<>(), "Individual", user);
        clientRepository.save(client1);
        clientRepository.save(client2);
        clientRepository.save(client3);
        Client clientA = new Client("BA54321", "Barclay's Bakes", "Cash Intensive", "United Kingdom", true, false, new ArrayList<>(), new ArrayList<>(), "Corporate", user);
        clientA.addOwnershipJurisdiction("Germany");
        Client clientB = new Client("CA12345", "Carrie's Cafe", "Cash Intensive", "China", true, true, new ArrayList<>(), new ArrayList<>(), "Corporate", user);
        Client clientC = new Client("AT52244", "Atlas Wealth", "", "United Kingdom", false, false, new ArrayList<>(), new ArrayList<>(), "Corporate", user);
        Client clientD = new Client("BA525252", "Barclay Trust", "", "United Kingdom", true, false, new ArrayList<>(), new ArrayList<>(), "Trust", user);
        clientRepository.save(clientA);
        clientRepository.save(clientB);
        clientRepository.save(clientC);
        clientRepository.save(clientD);
        Conveyancing conveyancing1 = new Conveyancing("0001", "purchase: 12 Dalhousie Street", client1, 1200, LocalDate.now(), 90000, 50000, true);
        Conveyancing conveyancing2 = new Conveyancing("0002", "purchase: 14 Dalhousie Street", client1, 1200, LocalDate.now(), 290000, 50000, true);
        Conveyancing conveyancing3 = new Conveyancing("0003", "purchase: 16 Dalhousie Street", client1, 1200, LocalDate.now(), 290000, 50000, true);
        Conveyancing conveyancing4 = new Conveyancing("0001", "", client2, 1200, LocalDate.now(), 290000, 180000, false);
        Conveyancing conveyancing5 = new Conveyancing("0001", "", client3, 2000, LocalDate.now(), 100000, 200000, true);
        Conveyancing conveyancing6 = new Conveyancing("0003", "", client3, 2000, LocalDate.now(), 1500000, 200000, false);
        Conveyancing conveyancing7 = new Conveyancing("0001", "", clientA, 2000, LocalDate.now(), 500000, 200000, true);
        Conveyancing conveyancing8 = new Conveyancing("0001", "", clientB, 2000, LocalDate.now(), 500000, 200000, true);
        conveyancingRepository.save(conveyancing1);
        conveyancingRepository.save(conveyancing2);
        conveyancingRepository.save(conveyancing3);
        conveyancingRepository.save(conveyancing4);
        conveyancingRepository.save(conveyancing5);
        conveyancingRepository.save(conveyancing6);
        conveyancingRepository.save(conveyancing7);
        conveyancingRepository.save(conveyancing8);
        TCSP tcsp = new TCSP("0002", "Company Incorporation", clientA, 1500, LocalDate.now(), "Company Incorporation", "United Kingdom", new ArrayList<>());
        tcspRepository.save(tcsp);

    }

}
