package tn.esprit.usermanagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.usermanagement.entities.ForumEntities.Media;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table( name = "Shop")
public class Shop implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idShop")
    private Integer idShop;
    private String name;
    private String mail;
    private Integer phoneNumber;
    private boolean isValidated;
    private String adresse;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "shop")
    private List<Product> products;
    @JsonIgnore
    @ManyToOne
    User user;
    @JsonIgnore
    @OneToOne
    private localisation address;
    private float somme =0;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Media> medias;



}