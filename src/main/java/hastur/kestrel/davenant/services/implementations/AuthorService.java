package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.models.AuthorModel;
import hastur.kestrel.davenant.models.CountryModel;
import hastur.kestrel.davenant.repositories.AuthorRepository;
import hastur.kestrel.davenant.repositories.CountryRepository;
import hastur.kestrel.davenant.services.interfaces.IAuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorService implements IAuthorService {

    private final AuthorRepository authorRepository;
    private final CountryRepository countryRepository;

    @Override
    public AuthorModel addAuthor(String name, String lastName, String countryName) {

        AuthorModel newAuthor = new AuthorModel();

        CountryModel countryModel = countryRepository.getCountryModelByName(countryName)
                .orElseThrow(() -> new RuntimeException("Country " + countryName + " not found.") );

        newAuthor.setName(name);
        newAuthor.setLastName(lastName);
        newAuthor.setCountry(countryModel);


        return newAuthor;

    }

    @Override
    public List<AuthorModel> getAuthorsByFullName(String lastName, String firstName) {

        return authorRepository.findAuthorModelsByNameAndLastName(firstName, lastName);

    }

    @Override
    public List<AuthorModel> getAllAuthors() {

        return authorRepository.findAll();

    }

    @Override
    public List<AuthorModel> getAuthorsByCountry(String countryName) {

        if(countryRepository.getCountryModelByName(countryName).isEmpty()){

            throw new RuntimeException("Country " + countryName + " not found.");

        }

        return authorRepository.findAuthorModelsByCountryName(countryName);


    }
}
