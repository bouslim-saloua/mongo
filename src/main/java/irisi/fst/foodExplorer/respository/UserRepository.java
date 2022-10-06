/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irisi.fst.foodExplorer.respository;

//import irisi.fst.foodExplorer.model.Commande;
//import irisi.fst.foodExplorer.model.Produit;
import irisi.fst.foodExplorer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

//import java.util.List;

/**
 *
 * @author USER
 */
@Repository
public interface UserRepository extends MongoRepository<User,Integer >{
   /* @Query("{'User.id':'?0'}")
    List<Commande> findAllCommandeByUser(int userId);*/
//List<User> findAll();


User findByEmail(String email);
User findByTelephone(String telephone);

    
}

