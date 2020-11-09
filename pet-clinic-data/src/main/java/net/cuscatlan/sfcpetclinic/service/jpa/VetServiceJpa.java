package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Vet;
import net.cuscatlan.sfcpetclinic.repository.VetRepository;
import net.cuscatlan.sfcpetclinic.service.VetService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Nov 9, 2020
 *
 */
@Service
@Profile("springJpa")
public class VetServiceJpa implements VetService {
	
	public final VetRepository vetRepository;
	
		public VetServiceJpa(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElseThrow(null);
	}

	@Override
	public Vet save(Vet object) {
		
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);

	}

}
