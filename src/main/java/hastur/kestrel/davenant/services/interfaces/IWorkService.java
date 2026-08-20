package hastur.kestrel.davenant.services.interfaces;

import hastur.kestrel.davenant.models.WorkModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IWorkService {

    public WorkModel addWork(String title, String originalLanguage);
    public List<WorkModel> getAllWorksByOriginalLanguage(String originalLanguage);
    public List<WorkModel> getAllWorksByTitle(String title);

}
