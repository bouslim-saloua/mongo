package irisi.fst.foodExplorer.respository;

import irisi.fst.foodExplorer.model.Produit;
import java.awt.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;

//import java.util.List;


public interface ProduitRepo extends MongoRepository<Produit, Integer> {
  @Query(value = "{'commandes.id': ?0}",  fields="{'id' : 1, 'nom' : 1, 'categorie' : 1, 'prix': 1}")
    List findProduitByCommande(@Param("id") int id);
/*@Query(fields = "{'id': 1, 'nom': 1, 'categorie': 1, 'prix': 1")
List findProduits();*/
}
