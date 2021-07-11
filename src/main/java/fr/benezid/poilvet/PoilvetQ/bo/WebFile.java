package fr.benezid.poilvet.PoilvetQ.bo;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


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
    private String path;

    private String type;

}
