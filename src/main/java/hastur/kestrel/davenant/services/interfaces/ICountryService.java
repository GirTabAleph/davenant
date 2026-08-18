package hastur.kestrel.davenant.services.interfaces;
import hastur.kestrel.davenant.models.CountryModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICountryService {

    public CountryModel addCountry(String countryName);
    public List<CountryModel> getAllCountries();
}