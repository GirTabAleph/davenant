package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "authorship")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorshipModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorshipid")
    private Integer authorId;

    @JoinColumn(name = "workid")
    @ManyToOne(fetch = FetchType.LAZY)
    private WorkModel work;

    @JoinColumn(name = "authorid")
    @ManyToOne(fetch = FetchType.LAZY)
    private AuthorModel author;

}
