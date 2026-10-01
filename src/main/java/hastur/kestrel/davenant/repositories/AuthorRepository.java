package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Integer> {

    @Query("""
           SELECT a.authorId, a.name, a.lastName, a.country
           FROM AuthorModel a
           WHERE a.name = :name AND a.lastName = :lastName
           """)
    public List<AuthorModel> findAuthorModelsByNameAndLastName(@Param("name") String name, @Param("lastName")String lastName);

    @Query("""
           SELECT a
           FROM AuthorModel a
           JOIN a.country c
           WHERE c.name = :countryName
           """)
    public List<AuthorModel> findAuthorModelsByCountryName(@Param("countryName") String countryName);

}