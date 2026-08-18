package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<CountryModel, Integer> {

    public Optional<CountryModel> getCountryModelByName(String name);

}
