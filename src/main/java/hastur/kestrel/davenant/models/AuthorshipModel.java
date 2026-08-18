package hastur.kestrel.davenant.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorship")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorshipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorshipid")
    private Integer authorshipId;

    @JoinColumn(name = "workid")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkModel work;

    @JoinColumn(name = "authorid")
    @ManyToOne(fetch = FetchType.LAZY)
    private AuthorModel author;

}
