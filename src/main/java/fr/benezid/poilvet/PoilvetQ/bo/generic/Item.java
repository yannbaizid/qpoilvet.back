
package fr.benezid.poilvet.PoilvetQ.bo.generic;

import java.time.Year;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String description;

    @OneToMany
    private List<WebFile> webFileList;

    private Year year;

    @ManyToMany
    private List<Category> categoryList;

    private int thumbnailIndex;

    private String link;

}
