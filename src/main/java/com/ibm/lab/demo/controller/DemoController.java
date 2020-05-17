package com.ibm.lab.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


    @RequestMapping(value = "/efk/{cpf}", method = RequestMethod.GET)
    public ResponseEntity<String> queryByCPF(@PathVariable String cpf) {
        try {
            logger.info("Recendo requisicao para {}" + cpf);
            return new ResponseEntity<String>("OK", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        try {
            logger.info("Hello efk log test");
           
            return new ResponseEntity<String>("OK", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
