package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.LanguageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageModel, Integer> {

    public Optional<LanguageModel> findLanguageModelByLanguage(String language);

    public Optional<LanguageModel> findLanguageModelByShortCode(String shortCode);

    public Optional<LanguageModel> findLanguageModelByLanguageId(Integer languageId);
}