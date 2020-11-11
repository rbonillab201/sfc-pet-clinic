package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Specialty;
import net.cuscatlan.sfcpetclinic.model.Vet;
import net.cuscatlan.sfcpetclinic.service.SpecialtyService;
import net.cuscatlan.sfcpetclinic.service.VetService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 8, 2020
 *
 */

@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialtyService specialtyService;

	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		if(object != null) {
			if(!object.getSpecialties().isEmpty()) {
				object.getSpecialties().forEach(specialty -> {
					if(specialty.getId() == null) {
						Specialty specialtySaved = specialtyService.save(specialty);
						specialty.setId(specialtySaved.getId());
					}
				});	
			} 
			return super.save(object);
		} else {
			return null;
		}	
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
