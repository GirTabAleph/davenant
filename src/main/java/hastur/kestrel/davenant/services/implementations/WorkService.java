package hastur.kestrel.davenant.services.implementations;

import hastur.kestrel.davenant.models.LanguageModel;
import hastur.kestrel.davenant.models.WorkModel;
import hastur.kestrel.davenant.repositories.LanguageRepository;
import hastur.kestrel.davenant.repositories.WorkRepository;
import hastur.kestrel.davenant.services.interfaces.IWorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkService implements IWorkService {

    private final WorkRepository workRepository;
    private final LanguageRepository languageRepository;

    @Override
    public WorkModel addWork(String title, String originalLanguage){

        WorkModel newWork = new WorkModel();
        LanguageModel originalLang = languageRepository.findLanguageModelByLanguage(originalLanguage)
                .orElseThrow(() -> new RuntimeException("Language " + originalLanguage + " not found.") );

        newWork.setTitle(title);
        newWork.setOriginalLanguage(originalLang);

        workRepository.save(newWork);

        return newWork;

    }

    @Override
    public List<WorkModel> getAllWorksByOriginalLanguage(String originalLanguage) {

        return workRepository.findAllByOriginalLanguage(originalLanguage);

    }

    @Override
    public List<WorkModel> getAllWorksByTitle(String title) {

        return workRepository.findAllByTitle(title);

    }
}
