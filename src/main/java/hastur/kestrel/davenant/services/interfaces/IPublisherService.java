package hastur.kestrel.davenant.services.interfaces;

import hastur.kestrel.davenant.models.PublisherModel;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IPublisherService {

    public PublisherModel addPublisher(String name, String country, String parentPublisher);
    public Optional<PublisherModel> getPublisherByName(String name);

}
