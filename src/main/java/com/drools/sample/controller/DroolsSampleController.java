package com.drools.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drools.sample.model.Fornecedor;
import com.drools.sample.service.DroolsService;

@RestController()
@RequestMapping("/api")
public class DroolsSampleController {
 
 @Autowired
 private DroolsService droolsService;
 
 @PostMapping("/avaliar")
 public int postTeste(@RequestBody Fornecedor fornecedor) {
	 Fornecedor resposta = droolsService.avaliar(fornecedor);
     return resposta.getPontuacao();
 }

}