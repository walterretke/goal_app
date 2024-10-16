package br.com.walterretke.goal_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.walterretke.goal_app.models.SalesRepresentativeModel;
import br.com.walterretke.goal_app.services.SalesRepresentativeService;

@RestController
@RequestMapping("/representante-comercial")
public class SalesRepresentativeController {

    @Autowired
    SalesRepresentativeService salesRepresentativeService;
    
    @PostMapping(path = "/criar")
    public void createSalesRepresentative(@RequestBody SalesRepresentativeModel newSalesRepresentative){
        salesRepresentativeService.storeNewSalesRepresentative(newSalesRepresentative);
    }

}
