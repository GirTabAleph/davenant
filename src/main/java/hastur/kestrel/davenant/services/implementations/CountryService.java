package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.services.interfaces.ICountryService;
import hastur.kestrel.davenant.models.CountryModel;
import hastur.kestrel.davenant.repositories.CountryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    //Repositories for data access.
    private final CountryRepository countryRepository;

    @Override
    @Transactional
    public CountryModel addCountry(String countryName){

        CountryModel newCountry = new CountryModel();

        if(countryRepository.getCountryModelByName(countryName).isPresent()){

            throw new RuntimeException("Country " + countryName + " already exists.");

        }

        newCountry.setName(countryName);

        countryRepository.save(newCountry);

        return newCountry;

    }

    @Override
    public List<CountryModel> getAllCountries(){

        return countryRepository.findAll();

    }

}
