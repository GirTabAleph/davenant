package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "language")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "languageid")
    private Integer languageId;

    @Column(name = "language", length = 30, nullable = false, unique = true)
    private String language;

    @Column(name = "languageshortcode", length = 5, nullable = false, unique = true)
    private String shortCode;

}