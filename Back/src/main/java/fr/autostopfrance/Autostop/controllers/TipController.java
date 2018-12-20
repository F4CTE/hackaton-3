package fr.autostopfrance.Autostop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.autostopfrance.Autostop.models.Tip;
import fr.autostopfrance.Autostop.services.TipService;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("Tips")
public class TipController {
	
	@Autowired
	TipService tipService;
	
	@GetMapping("/all")
	public List<Tip> findAllTips(){
		return tipService.findAllTips();
	}
	
	@GetMapping("/{id}")
	public Tip findTip(@PathVariable("id") Long id) {
		return tipService.findById(id);
	}
	
	

}
