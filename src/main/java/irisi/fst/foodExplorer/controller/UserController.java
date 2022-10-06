/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irisi.fst.foodExplorer.controller;

import irisi.fst.foodExplorer.model.Commande;
import irisi.fst.foodExplorer.model.User;
import irisi.fst.foodExplorer.respository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	private UserRepository repository;

    @PostMapping("/addUser")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "Added user with id : " + user.getId();
	}

	@GetMapping("/findAllUsers")
	public List<User> getUsers() {
		return repository.findAll();
	}

	@GetMapping("/findAllUsers/{id}")
	public Optional<User> getUser(@PathVariable int id) {
		return repository.findById(id);
	}

	/*@GetMapping("/getUserCommande")
	public List<Commande> getUserCommande(@RequestBody User user){
		return repository.findAllCommandeByUser(user.getId());
	}*/

@GetMapping("/findByEmail/{email}")
public User findByEmail(@PathVariable String email){
return repository.findByEmail(email);
}

@GetMapping("/findByPhone/{telephone}")
public User findByTelephone(@PathVariable String telephone){
return repository.findByTelephone(telephone);
}


@PostMapping("/register")
public String register(@RequestBody User user){
User userDB = repository.findByEmail(user.getEmail());
User userDBPhone = repository.findByEmail(user.getEmail());

if(userDB != null || userDBPhone !=null){
return "email or phone are already in use";
}else{
repository.save(user);
return "account registered successfully";
}

}
@PostMapping("/seConnecter")
public int signIn(@PathVariable String email, @PathVariable String password){
User userDB = repository.findByEmail(email);
if(userDB == null){
return -1;
}else if(!(password.equals(userDB.getPassword()))){
return -2;
}else{
return 1;
}
}


}

