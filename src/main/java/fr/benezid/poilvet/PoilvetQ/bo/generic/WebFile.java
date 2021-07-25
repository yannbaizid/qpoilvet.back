package fr.benezid.poilvet.PoilvetQ.bo.generic;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class WebFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Transient
    private String fileBase64;
    //@Transient
    // private String img;

    private String name;

    private String alt;

    private String src;

    private String type;

}
