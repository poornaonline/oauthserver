package com.poorna.oauthserver.restcontroller;

import com.poorna.oauthserver.dao.Billionaire;
import com.poorna.oauthserver.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillionaireRestController {

    @Autowired
    private BillionaireService billionaireService;

    @GetMapping("/api/billionaires")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Iterable<Billionaire> getBillionaires() {
        return billionaireService.getBillionaires();
    }

    @GetMapping("/admin/billionaires")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Iterable<Billionaire> getAdminBillionaires() {
        return billionaireService.getAdminBillionaires();
    }
}
