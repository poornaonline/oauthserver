package com.poorna.oauthserver.dao;

import com.poorna.oauthserver.dao.user.User;
import com.poorna.oauthserver.dao.user.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;

@Service
@Transactional
public class DataSeeder {

    @Autowired
    private BillionaireRepository billionaireRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

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

        // Adding basic accounts & roles to begin
        if (userRepository.count() == 0) {
            userRepository.save(new User("admin",
                    passwordEncoder.encode("password"),
                    Arrays.asList(new UserRole("USER"), new UserRole("ADMIN"))));
            userRepository.save(new User("user",
                    passwordEncoder.encode("password"),
                    Arrays.asList(new UserRole("USER"))));
        }

    }

}
