package fr.benezid.poilvet.PoilvetQ.bo.generic;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public  class GenericIdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
}
