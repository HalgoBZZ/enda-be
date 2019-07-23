package org.websparrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Statut;
import org.websparrow.repository.StatutRepository;

@RestController
@RequestMapping("statuts")
public class StatutController {

	@Autowired
	StatutRepository statutRepository;

	@GetMapping("/all")
	public Iterable<Statut> allStatut() {

		return statutRepository.findAll();
	}

	
	@PutMapping("/update")
	public Statut updateStatut(@RequestBody Statut statut) {

		return statutRepository.save(statut);
	}

}
