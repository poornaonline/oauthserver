package com.poorna.oauthserver.service;

import com.poorna.oauthserver.dao.BillionaireRepository;
import com.poorna.oauthserver.dao.Billionaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillionaireService {

    @Autowired
    private BillionaireRepository billionaireRepository;

    public Iterable<Billionaires> getBillionaires() {
        return billionaireRepository.findAll();
    }
}
