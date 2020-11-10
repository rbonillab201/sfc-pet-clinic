package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Owner;
import net.cuscatlan.sfcpetclinic.model.Pet;
import net.cuscatlan.sfcpetclinic.service.OwnerService;
import net.cuscatlan.sfcpetclinic.service.PetService;
import net.cuscatlan.sfcpetclinic.service.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	public final PetService petService;
	public final PetTypeService petTypeService;
	
	public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// Evalua si el objeto no es nulo
		if (object != null) {
			// evalua que existan mascotas
			if (!object.getPets().isEmpty()) {
				// barre el arreglo de mascotas
				object.getPets().forEach(pet -> {
					//evalua que exista un tipo de mascota definido para la mascota
					if (pet.getPetType() == null) {
						throw new RuntimeException("El tipo de mascota es requerido");
					} else {
						// si el id del tipo de mascota es nulo, significa que no está persistido y lo persiste
						if (pet.getPetType().getId() == null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}
					// evalua que la mascota está persistida, sino la persiste
					if (pet.getId() == null) {
						Pet petSaved = petService.save(pet);
						pet.setId(petSaved.getId());				
					}
				});		
			}
			return super.save(object);	
		} else {
			return null;
		}
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);	
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);		
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}


}
