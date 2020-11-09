package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Owner;
import net.cuscatlan.sfcpetclinic.repository.OwnerRepository;
import net.cuscatlan.sfcpetclinic.service.OwnerService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 30, 2020
 *
 */
@Service
@Profile("springJpa")
public class OwnerServiceJpa implements OwnerService {

	public final OwnerRepository ownerRepository;
	
	public OwnerServiceJpa(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owner = new HashSet<>();
		ownerRepository.findAll().forEach(owner::add);
		return owner;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);

	}

	@Override
	public Owner findByLastName(String lastName) {
		return ownerRepository.findByLastName(lastName);
	}

}
