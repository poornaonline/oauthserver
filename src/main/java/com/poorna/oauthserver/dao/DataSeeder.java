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

        Billionaire poorna = new Billionaire("Poorna Sampath Jayasinghe", 28);
        Billionaire elon = new Billionaire("Elon Musk", 49);
        Billionaire bill = new Billionaire("Bill Gates", 52);
        Billionaire larry = new Billionaire("Larry Page", 45);

        ArrayList<Billionaire> billionaires = new ArrayList<>();
        billionaires.add(poorna);
        billionaires.add(elon);
        billionaires.add(bill);
        billionaires.add(larry);

        billionaireRepository.saveAll(billionaires);

    }

}
