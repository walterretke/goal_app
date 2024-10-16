package br.com.walterretke.goal_app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterretke.goal_app.models.SalesRepresentativeModel;

@RestController
@RequestMapping("/representante-comercial")
public class SalesRepresentativeController {
    
    @PostMapping(path = "/criar")
    public void createSalesRepresentative(@RequestBody SalesRepresentativeModel salesRepresentative){
        
    }

}
