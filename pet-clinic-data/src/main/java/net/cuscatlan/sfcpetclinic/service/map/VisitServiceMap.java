package net.cuscatlan.sfcpetclinic.service.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Visit;
import net.cuscatlan.sfcpetclinic.service.VisitService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 9 nov. 2020
 *
 */
@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findAll() {
		return super.findAll();
	}

	@Override
	public Visit findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		 if(visit != null) {
			 if (visit.getPet() == null || visit.getPet().getOwner() == null || 
					 visit.getPet().getId() == null || visit.getPet().getOwner().getId() == null) {
				throw new RuntimeException("Falta información del Pet del Owner");
			 } else {
				 return super.save(visit);
			 }	 
			 
		 } else {
			return null; 
		 }
		
	}

	@Override
	public void delete(Visit object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
