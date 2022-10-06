package irisi.fst.foodExplorer.model;

import java.util.List;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Produit")
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
public class Produit {
    @Id
    private int id;
    private String nom;
    private String categorie;
    private Long prix;
private int userId;
@DBRef
private List<Commande> commandes;

}
