package hastur.kestrel.davenant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "editionwork")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditionWorkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "editionworkid")
    private Integer editionWorkId;

    @JoinColumn(name = "physicaleditionid")
    @ManyToOne(fetch = FetchType.LAZY)
    private PhysicalEditionModel physicalEdition;

    @JoinColumn(name = "workid")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkModel work;

}
