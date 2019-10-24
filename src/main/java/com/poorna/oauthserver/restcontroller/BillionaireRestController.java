package com.poorna.oauthserver.restcontroller;

import com.poorna.oauthserver.dao.Billionaires;
import com.poorna.oauthserver.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class BillionaireRestController {

    @Autowired
    private BillionaireService billionaireService;

    @GetMapping("/api/billionaires")
    public Iterable<Billionaires> getBillionaires() {
        return billionaireService.getBillionaires();
    }
}
