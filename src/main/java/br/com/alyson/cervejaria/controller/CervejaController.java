package br.com.alyson.cervejaria.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cerveja")
public class CervejaController {

    private static final Logger logger = LoggerFactory.getLogger(CervejaController.class);

    @RequestMapping("/cadastrar")
    public String cadastrar(){
        return "cerveja/cadastrar-cerveja";
    }
}