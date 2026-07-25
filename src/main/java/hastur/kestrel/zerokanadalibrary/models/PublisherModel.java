package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "publisher")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer publisherId;

    @Column(name = "publishername", length = 150, nullable = false, unique = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryid", nullable = false, unique = false)
    private CountryModel country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parentid", nullable = true, unique = false)
    private PublisherModel parent;

}
