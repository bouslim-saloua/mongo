/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irisi.fst.foodExplorer.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author USER
 */
@Getter
@Setter
@ToString
@Builder(toBuilder = true)
//@JsonDeserialize(builder = User.UserBuilder.class)
@Document(collection="User")
public class User {
    @Id
   private int id;
private String nom; 
private String prenom;
/*private String email;
private String password;
private String pays;
private String ville;
private String telephone;
private String adresse;*/


}

