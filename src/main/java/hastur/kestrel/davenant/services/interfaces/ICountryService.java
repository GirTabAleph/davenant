package hastur.kestrel.davenant.services.interfaces;
import hastur.kestrel.davenant.models.CountryModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICountryService {

    public CountryModel addCountry(String countryName);
    public Optional<CountryModel> getCountryByName(String name);
    public List<CountryModel> getAllCountries();
}