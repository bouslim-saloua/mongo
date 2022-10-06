package irisi.fst.foodExplorer.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Builder(toBuilder = true)
@Document(collection="Commande")
public class Commande {
    @Id
    private int id;
    private User user;
    private int quantite;
    private Date dateCommande;
    @DBRef
    private List<Produit> produits;
}
