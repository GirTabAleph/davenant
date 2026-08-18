package hastur.kestrel.zerokanadalibrary.services.interfaces;

import hastur.kestrel.zerokanadalibrary.models.CountryModel;
import org.springframework.stereotype.Service;

@Service
public interface ICountryService {

    public CountryModel addCountry(String countryName);

}
