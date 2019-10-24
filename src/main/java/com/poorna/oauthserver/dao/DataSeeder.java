package com.poorna.oauthserver.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Configuration
public class DataSeeder {

    @Autowired
    private BillionaireRepository billionaireRepository;

    @PostConstruct
    public void SeedData() {

        Billionaires poorna = new Billionaires("Poorna Sampath Jayasinghe", 28);
        Billionaires elon = new Billionaires("Elon Musk", 49);
        Billionaires bill = new Billionaires("Bill Gates", 52);
        Billionaires larry = new Billionaires("Larry Page", 45);

        ArrayList<Billionaires> billionaires = new ArrayList<>();
        billionaires.add(poorna);
        billionaires.add(elon);
        billionaires.add(bill);
        billionaires.add(larry);

        billionaireRepository.saveAll(billionaires);

    }

}
