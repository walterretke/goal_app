package br.com.walterretke.goal_app.repositories;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.walterretke.goal_app.models.SalesRepresentativeModel;

public interface SalesRepresentativeRepository extends JpaRepository<SalesRepresentativeModel, UUID> {

    Optional<SalesRepresentativeModel> findByName(String name);

}
