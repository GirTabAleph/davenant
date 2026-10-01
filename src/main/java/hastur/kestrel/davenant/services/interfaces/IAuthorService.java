package hastur.kestrel.davenant.services.interfaces;

import hastur.kestrel.davenant.models.AuthorModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAuthorService{

    public AuthorModel addAuthor(String name, String lastName, String countryName);
    public List<AuthorModel> getAuthorsByFullName(String lastName, String firstName);
    public List<AuthorModel> getAllAuthors();
    public List<AuthorModel> getAuthorsByCountry(String countryName);

}
