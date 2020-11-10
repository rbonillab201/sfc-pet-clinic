package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Pet;
import net.cuscatlan.sfcpetclinic.repository.PetRepository;
import net.cuscatlan.sfcpetclinic.service.PetService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Nov 9, 2020
 *
 */
@Service
@Profile("springJpa")
public class PetServiceJpa implements PetService {
	
	public final PetRepository petRepository;

	public PetServiceJpa(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id).orElseThrow(null);
	}

	@Override
	public Pet save(Pet object) {
		return petRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		petRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		petRepository.deleteById(id);
	}

}
