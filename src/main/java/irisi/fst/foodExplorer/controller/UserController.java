/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package irisi.fst.foodExplorer.controller;

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
	public String saveBook(@RequestBody User user) {
		repository.save(user);
		return "Added user with id : " + user.getId();
	}

@GetMapping("/findAllUsers")
	public List<User> getBooks() {
		return repository.findAll();
	}

@GetMapping("/findAllUsers/{id}")
	public Optional<User> getBook(@PathVariable int id) {
		return repository.findById(id);
	}
}

