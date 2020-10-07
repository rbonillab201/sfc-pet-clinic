package net.cuscatlan.sfcpetclinic.service;

import java.util.Set;
import net.cuscatlan.sfcpetclinic.model.Pet;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

public interface PetService {
	
	Pet findById(Long id);
	Set<Pet> findAll();
	Pet save(Pet pet);

}
