package irisi.fst.foodExplorer.respository;

import irisi.fst.foodExplorer.model.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepo extends MongoRepository<Produit, Integer>{
    public List<Produit> findProduitByCategorie(String categorie);
}
