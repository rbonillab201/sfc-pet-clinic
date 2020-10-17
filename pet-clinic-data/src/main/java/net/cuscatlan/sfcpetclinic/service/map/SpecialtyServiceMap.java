package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Specialty;
import net.cuscatlan.sfcpetclinic.service.SpecialtyService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 17, 2020
 *
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

	@Override
	public Set<Specialty> findAll() {
		return super.findAll();
	}

	@Override
	public Specialty findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Specialty save(Specialty object) {
		return super.save(object);
	}

	@Override
	public void delete(Specialty object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

}
