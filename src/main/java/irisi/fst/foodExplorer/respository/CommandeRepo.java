package irisi.fst.foodExplorer.respository;

import irisi.fst.foodExplorer.model.Commande;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommandeRepo extends MongoRepository<Commande, Integer> {
  @Query(value = "{'userId': ?0}")
    List<Commande> findCommandeByUserId(@Param("id") int id);
}
