package irisi.fst.foodExplorer.respository;

import irisi.fst.foodExplorer.model.Produit;
import java.awt.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.List;

@Repository
public interface ProduitRepo extends MongoRepository<Produit, Integer>{
   // public List<Produit> findProduitByCategorie(String categorie);
 @Query(value = "{'commandes.id': ?0}", fields = "{'commandes' : 0}")
    List findProduitByCommdande(int commandeId);

     List findProduitByNom(String nom);
}
