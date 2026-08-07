package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.AuthorshipModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorshipRepository extends JpaRepository<AuthorshipModel, Integer> {

    @Query("""
           SELECT aut
           FROM AuthorshipModel aut
           JOIN aut.work w
           WHERE w.title  = :workName
           """)
    public List<AuthorshipModel> findAuthorshipModelsByWork(@Param("workName")String workName);

}
