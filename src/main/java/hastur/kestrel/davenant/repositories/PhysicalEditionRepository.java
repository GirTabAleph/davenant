package hastur.kestrel.davenant.repositories;

import hastur.kestrel.davenant.models.PhysicalEditionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEditionRepository extends JpaRepository<PhysicalEditionModel, Integer> {



}
