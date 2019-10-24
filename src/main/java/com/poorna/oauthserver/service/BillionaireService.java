package com.poorna.oauthserver.service;

import com.poorna.oauthserver.dao.BillionaireRepository;
import com.poorna.oauthserver.dao.Billionaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BillionaireService {

    @Autowired
    private BillionaireRepository billionaireRepository;

    public Iterable<Billionaire> getBillionaires() {
        return billionaireRepository.findAll();
    }

    public Iterable<Billionaire> getAdminBillionaires() {
        ArrayList<Billionaire> billionaires = new ArrayList<>();
        billionaireRepository.findAll().forEach(b -> billionaires.add(b));

        Billionaire newBillionaire = new Billionaire("Jack Dorsey", 45);
        billionaires.add(newBillionaire);

        return billionaires;
    }
}
