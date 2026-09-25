package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.models.CountryModel;
import hastur.kestrel.davenant.models.PublisherModel;
import hastur.kestrel.davenant.repositories.CountryRepository;
import hastur.kestrel.davenant.repositories.PublisherRepository;
import hastur.kestrel.davenant.services.interfaces.IPublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PublisherService implements IPublisherService {

    private final CountryRepository countryRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public PublisherModel addPublisher(String name, String country, String parentPublisher) {

        PublisherModel newPublisher = new PublisherModel();

        CountryModel countryModel = countryRepository.getCountryModelByName(country)
                .orElseThrow(() -> new RuntimeException("Country " + country + " not found.") );

        PublisherModel parent = null;

        //Cases when the parent publisher param is not null indicate a parent exists.
        if(parentPublisher != null){

            parent = publisherRepository.findPublisherModelByName(parentPublisher)
                    .orElseThrow(() -> new RuntimeException("Parent with name " + parentPublisher + " not found."));

        }

        newPublisher.setName(name);
        newPublisher.setCountry(countryModel);
        newPublisher.setParent(parent);

        return newPublisher;
    }

    @Override
    public Optional<PublisherModel> getPublisherByName(String name) {

        return publisherRepository.findPublisherModelByName(name);

    }
}
