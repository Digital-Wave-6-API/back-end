package com.digitalwave.recrutatech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalwave.recrutatech.entity.Habilidade;
import com.digitalwave.recrutatech.interfaces.IHabilidadeService;

@RestController
@RequestMapping(value="/hab")
@CrossOrigin
public class HabilidadeController {
	@Autowired
	private IHabilidadeService service;
	
	@GetMapping("/")
	public List<Habilidade> allHabilidade(){
		return service.findAllHabilidade();
	}
	
	@PostMapping("/add")
	public Habilidade newHabilidade(@RequestBody Habilidade habilidade) {
		return service.newHabilidade(habilidade);
	}

}
