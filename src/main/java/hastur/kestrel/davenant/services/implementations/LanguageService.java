package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.models.LanguageModel;
import hastur.kestrel.davenant.repositories.LanguageRepository;
import hastur.kestrel.davenant.services.interfaces.ILanguageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LanguageService implements ILanguageService {

    private final LanguageRepository languageRepository;


    @Override
    public LanguageModel addLanguage(String language, String shortcode) {

        LanguageModel newLang = new LanguageModel();

        if(languageRepository.findLanguageModelByLanguage(language).isPresent()){

            throw new RuntimeException("Language " + language + "already exists.");

        }

        newLang.setLanguage(language);
        newLang.setShortCode(shortcode);

        languageRepository.save(newLang);

        return newLang;

    }

    @Override
    public Optional<LanguageModel> getLanguageByName(String name) {

        return languageRepository.findLanguageModelByLanguage(name);

    }

    @Override
    public List<LanguageModel> getAllLanguages() {

        return languageRepository.findAll();

    }

}