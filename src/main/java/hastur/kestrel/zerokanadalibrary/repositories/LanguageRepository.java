package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.LanguageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageModel, Integer> {

    public Optional<LanguageModel> findLanguageModelByLanguage(String language);

    public Optional<LanguageModel> findLanguageModelByShortCode(String shortCode);

}