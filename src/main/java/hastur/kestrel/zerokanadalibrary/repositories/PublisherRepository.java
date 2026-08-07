package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherModel, Integer> {

    public PublisherModel findPublisherModelByName(String publisherName);

}