package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, Integer> {

    public Optional<PublisherModel> findPublisherModelByName(String publisherName);

    @Query("""
           SELECT p
           FROM PublisherModel p
           INNER JOIN p.parent par
           WHERE par.name = :parentName
           """)
    public List<PublisherModel> findPublisherModelsByParentName(@Param("parentName") String parentName);

}