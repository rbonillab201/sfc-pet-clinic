package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Vet;
import net.cuscatlan.sfcpetclinic.service.CrudService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 8, 2020
 *
 */

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

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
		return super.save(object.getId(), object);
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
