package irisi.fst.foodExplorer.controller;

import irisi.fst.foodExplorer.model.Produit;
import irisi.fst.foodExplorer.model.User;
import irisi.fst.foodExplorer.respository.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    @Autowired
    private ProduitRepo produitRepo;

    @PostMapping("/addProduit")
    public String save(@RequestBody Produit produit) {
        produitRepo.save(produit);
        return "Added user with id : " + produit.getId();
    }
    @GetMapping("/")
    public List<Produit> getAllProduits() {
        return produitRepo.findAll();
    }
    @GetMapping("/getByCategorie/{categorie}")
    public List<Produit> getAllProduitsByCategorie(@PathVariable String categorie) {
        return produitRepo.findProduitByCategorie(categorie);
    }
}
