package hastur.kestrel.zerokanadalibrary.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LanguageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "languageid")
    private Integer languageId;

    @Column(name = "language", length = 30)
    private String language;

    @Column(name = "languageshortcode", length = 5)
    private String shortCode;

}