package com.poorna.oauthserver.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionaireRepository extends CrudRepository<Billionaire, Integer> {

}
