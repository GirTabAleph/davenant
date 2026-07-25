package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "physicaledition")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhysicalEditionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "physicaleditionid")
    private Integer physicalEditionId;

    @JoinColumn(name = "workid")
    @OneToOne(fetch = FetchType.LAZY)
    private WorkModel work;

    @JoinColumn(name = "publisherid")
    @OneToOne(fetch = FetchType.LAZY)
    private PublisherModel publisher;

    @JoinColumn(name = "editionlanguageid")
    @OneToOne(fetch = FetchType.LAZY)
    private LanguageModel language;

    @Column(name = "isbn", length = 13, nullable = false, unique = true)
    private String isbn;

    @Column(name = "pagecount")
    private int pageCount;

    // Reserved for additional data not native to the original work,
    // such as "annotated edition", "illustrated edition", "revised second edition",
    // et cetera.
    @Column(name = "editionname", length = 100, nullable = true, unique = false)
    private String editionName;

    @Column(name = "editionnumber", nullable = true, unique = false)
    private int editionNumber;

    @Column(name = "publicationdate", nullable = false, unique = false)
    private LocalDate publicationDate;

}
