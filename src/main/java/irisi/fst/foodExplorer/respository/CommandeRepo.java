package irisi.fst.foodExplorer.respository;

import irisi.fst.foodExplorer.model.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommandeRepo extends MongoRepository<Commande, Integer> {
}
