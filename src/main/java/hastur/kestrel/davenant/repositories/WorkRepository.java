package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.WorkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface WorkRepository extends JpaRepository<WorkModel, Integer> {

    @Query("""
           SELECT w
           FROM WorkModel w
           JOIN w.originalLanguage ol
           WHERE ol.language = :originalLanguage
           """)
    public List<WorkModel> findAllByOriginalLanguage(@Param("originalLanguage") String originalLanguage);

    public List<WorkModel> findAllByTitle(String title);

    Optional<List<WorkModel>> findWorkModelByTitle(String title);
}
