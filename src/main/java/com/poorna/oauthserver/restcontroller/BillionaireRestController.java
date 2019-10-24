package com.poorna.oauthserver.restcontroller;

import com.poorna.oauthserver.dao.Billionaire;
import com.poorna.oauthserver.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillionaireRestController {

    @Autowired
    private BillionaireService billionaireService;

    @GetMapping("/api/billionaires")
    public Iterable<Billionaire> getBillionaires() {
        return billionaireService.getBillionaires();
    }

    @GetMapping("/admin/billionaires")
    public Iterable<Billionaire> getAdminBillionaires() {
        return billionaireService.getAdminBillionaires();
    }
}
