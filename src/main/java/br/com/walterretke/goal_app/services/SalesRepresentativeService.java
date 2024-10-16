package br.com.walterretke.goal_app.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.walterretke.goal_app.models.SalesRepresentativeModel;
import br.com.walterretke.goal_app.repositories.SalesRepresentativeRepository;

@Service
public class SalesRepresentativeService {

    private final SalesRepresentativeRepository salesRepresentativeRepository;

    @Autowired
    public SalesRepresentativeService(SalesRepresentativeRepository salesRepresentativeRepository){
        this.salesRepresentativeRepository = salesRepresentativeRepository;
    }

    public SalesRepresentativeModel storeNewSalesRepresentative(SalesRepresentativeModel newSalesRepresentative){
        Optional<SalesRepresentativeModel> existingSalesRepresentative = salesRepresentativeRepository.findByName(newSalesRepresentative.getName());

        if(existingSalesRepresentative.isPresent()){
            throw new IllegalArgumentException("O Representante Comercial já existe");
        }

        return salesRepresentativeRepository.save(newSalesRepresentative);
    }
}
