package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorid")
    private Integer authorId;

    @Column(name = "authorname", length = 100, nullable = false, unique = false)
    private String name;

    @Column(name = "authorlastname", length = 100, nullable = false, unique = false)
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "countryid", nullable = false, unique = false)
    private CountryModel country;

}
