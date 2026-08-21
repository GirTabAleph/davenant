package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.PhysicalEditionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhysicalEditionRepository extends JpaRepository<PhysicalEditionModel, Integer> {

    public List<PhysicalEditionModel> findAllByIsbn(String isbn);

    public List<PhysicalEditionModel> findAllByEditionName(String editionName);

}
