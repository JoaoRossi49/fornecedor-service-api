package com.drools.sample.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.sample.model.Fornecedor;

@Service
public class DroolsService {
 
 @Autowired
    private KieContainer kieContainer;

  public Fornecedor avaliar(Fornecedor fornecedor) {
	         KieSession kieSession = kieContainer.newKieSession();
	         kieSession.insert(fornecedor);
	         kieSession.fireAllRules();
	         kieSession.dispose();
	         return fornecedor;
	     }

}