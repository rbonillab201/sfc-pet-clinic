package net.cuscatlan.sfcpetclinic.service;

import java.util.Set;

import net.cuscatlan.sfcpetclinic.model.Vet;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

public interface VetService {
	
	Vet findById(Long id);
	Set<Vet> findAll();
	Vet save(Vet vet);

}
