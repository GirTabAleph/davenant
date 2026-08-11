package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorModel, Integer> {

    public Optional<AuthorModel> findAuthorModelByNameAndLastName(String name, String lastName);

    @Query("""
           SELECT a.authorId, a.name, a.lastName, c.name
           FROM AuthorModel a
           JOIN a.country c
           WHERE c.name = :countryName
           """)
    public List<AuthorModel> findAuthorModelsByCountryName(@Param("countryName") String countryName);

}