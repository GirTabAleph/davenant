package hastur.kestrel.davenant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "work")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkModel {

    @Id
    @Column(name = "workid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer workId;

    @Column(name = "title", nullable = false, unique = false)
    private String title;

    @JoinColumn(name = "originallanguageid", nullable = false, unique = false)
    @OneToOne(cascade = CascadeType.ALL)
    private LanguageModel originalLanguage;


}
