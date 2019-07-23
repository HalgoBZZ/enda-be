package org.websparrow.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.websparrow.entity.Demande;
import org.websparrow.repository.DemandeRepository;

@RestController

@RequestMapping("demandes")
@CrossOrigin(origins = "*")
public class DemandeController {

	@Autowired
	DemandeRepository demandeRepository;

	// insert or update new country into database
	@PostMapping("/save")
	public Demande save(@RequestBody Demande demande) {
		return demandeRepository.save(demande);
	}

	// fetch all country list from database
	@GetMapping("/all")
	public Iterable<Demande> allCountry() {
		return demandeRepository.findAll();
	}

	// fetch specific country by their ID
	@GetMapping("/{idDmd}")
	public Optional<Demande> demandeById(@PathVariable("idDmd") Long idDmd) {
		return demandeRepository.findById(idDmd);
	}

	// delete country from database
	@DeleteMapping("/{idDmd}")
	public void deleteDemande(@PathVariable("idDmd") Long idDmd) {
		demandeRepository.deleteById(idDmd);
	}
}
