package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Specialty;
import net.cuscatlan.sfcpetclinic.repository.SpecialtyRepository;
import net.cuscatlan.sfcpetclinic.service.SpecialtyService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 9 nov. 2020
 *
 */

@Service
@Profile("springJpa")
public class SpecialtyServiceJpa implements SpecialtyService {

	public final SpecialtyRepository specialtyRepository;
	
	public SpecialtyServiceJpa(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Specialty> findAll() {
		Set<Specialty> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty findById(Long id) {
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Specialty save(Specialty object) {
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Specialty object) {
		specialtyRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		specialtyRepository.deleteById(id);
	}

}
