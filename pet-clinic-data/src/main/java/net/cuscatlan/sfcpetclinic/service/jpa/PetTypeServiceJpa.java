package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.PetType;
import net.cuscatlan.sfcpetclinic.repository.PetTypeRepository;
import net.cuscatlan.sfcpetclinic.service.PetTypeService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Nov 9, 2020
 *
 */
@Service
@Profile("springJpa")
public class PetTypeServiceJpa implements PetTypeService {
	
	public final PetTypeRepository petTypeRepository;
	
	public PetTypeServiceJpa(PetTypeRepository petTypeRepository) {
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		Set<PetType> types = new HashSet<>();
		petTypeRepository.findAll().forEach(types::add);
		return types;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElseThrow(null);
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		petTypeRepository.deleteById(id);

	}

}
