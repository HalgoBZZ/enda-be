package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;

import org.websparrow.entity.Demande;

public interface DemandeRepository extends CrudRepository<Demande, Long> {

}
