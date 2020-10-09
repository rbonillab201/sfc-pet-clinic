package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Pet;
import net.cuscatlan.sfcpetclinic.service.CrudService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
