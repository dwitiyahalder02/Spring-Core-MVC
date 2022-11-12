package com.navinreddy.springbootMVC;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.navinreddy.springbootMVC.Model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		//List<Alien> aliens=Arrays.asList(new Alien(101,"diti"),new Alien(102,"sukanta"));
		List<Alien> findAll = repo.findAll();
		System.out.println("fetching aliens");
		return findAll;
	}
	@GetMapping("/alien/{aid}")
	@ResponseBody
	public Alien getAlien(@PathVariable("aid") int aid)
	{
		Optional<Alien> alien=repo.findById(aid);
		return alien.get();
	}
	@PostMapping("/addalien")
	@ResponseBody
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
}
