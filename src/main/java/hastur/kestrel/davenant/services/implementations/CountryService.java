package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.services.interfaces.ICountryService;
import hastur.kestrel.davenant.models.CountryModel;
import hastur.kestrel.davenant.repositories.CountryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

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
    public Optional<CountryModel> getCountryByName(String name){

        return countryRepository.getCountryModelByName(name);

    }

    @Override
    public List<CountryModel> getAllCountries(){

        return countryRepository.findAll();

    }

}
