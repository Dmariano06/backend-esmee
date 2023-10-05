package com.csi.esmee.demo.model;

import jakarta.persistence.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Entity
public class Tableau {
    public Tableau() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prix")
    private Long prix;

    @Column(name="collection")
    private String collection;

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Number getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public Tableau(Long id, String nom,String collection, String description, Long prix) {
        this.id = id;
        this.prix = prix;
        this.nom = nom;
        this.collection = collection;
        this.description = description;
    }
    @Override
    public String toString() {
        String response;
        return "[id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ",collection =" + collection + "]";
    }
}
