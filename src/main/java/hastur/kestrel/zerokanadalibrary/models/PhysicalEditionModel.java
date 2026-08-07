package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    /*
        Reserved for the name of the book, akin to a container. If the container (the book) contains only
        one work the edition name is the work itself.
    */
    @Column(name = "editionname", length = 100, nullable = true, unique = false)
    private String editionName;

    @Column(name = "editionnumber", nullable = true, unique = false)
    private int editionNumber;

    @Column(name = "publicationyear", length = 4, nullable = true, unique = false)
    private String publicationYear;

}
