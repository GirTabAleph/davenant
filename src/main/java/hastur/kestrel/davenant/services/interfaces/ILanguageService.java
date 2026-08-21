package hastur.kestrel.davenant.services.interfaces;

import hastur.kestrel.davenant.models.LanguageModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ILanguageService {

    public LanguageModel addLanguage(String language, String shortcode);
    public Optional<LanguageModel> getLanguageByName(String name);
    public List<LanguageModel> getAllLanguages();

}
