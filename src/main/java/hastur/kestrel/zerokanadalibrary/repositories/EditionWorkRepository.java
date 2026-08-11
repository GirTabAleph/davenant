package hastur.kestrel.zerokanadalibrary.repositories;

import hastur.kestrel.zerokanadalibrary.models.EditionWorkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditionWorkRepository extends JpaRepository<EditionWorkModel, Integer> {

    public List<EditionWorkModel> getEditionWorkModelsByPhysicalEdition_EditionName(String physicalEditionEditionName);

}
