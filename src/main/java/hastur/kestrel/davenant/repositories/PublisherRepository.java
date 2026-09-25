package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, Integer> {

    public Optional<PublisherModel> findPublisherModelByName(String publisherName);

}