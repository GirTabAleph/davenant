package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.WorkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

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

}
