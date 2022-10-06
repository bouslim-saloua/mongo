/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irisi.fst.foodExplorer.controller;

import irisi.fst.foodExplorer.model.Commande;
import irisi.fst.foodExplorer.respository.CommandeRepo;
import java.util.List;
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
@RequestMapping("/commande")
public class CommandeController {
    private CommandeRepo repository;

  @PostMapping("/saveCommande")
	public String saveCommande(@RequestBody  Commande cmd) {
		repository.save(cmd);
		return "Added commande with id : " + cmd.getId();
	}

@GetMapping("/commandes")
public List<Commande> findAll(){
return repository.findAll();
}

@GetMapping("/commandes/findAllByUser")
List<Commande> findCommandeByUserId(@PathVariable Long id){
return repository.findCommandeByUserId(id);
}

}
