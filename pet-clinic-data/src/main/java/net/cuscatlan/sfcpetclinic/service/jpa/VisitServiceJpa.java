package net.cuscatlan.sfcpetclinic.service.jpa;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import net.cuscatlan.sfcpetclinic.model.Visit;
import net.cuscatlan.sfcpetclinic.repository.VisitRespository;
import net.cuscatlan.sfcpetclinic.service.VisitService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 10 nov. 2020
 *
 */
@Service
@Profile("springJpa")
public class VisitServiceJpa implements VisitService {
	
	public final VisitRespository visitRespository;
	
	public VisitServiceJpa(VisitRespository visitRespository) {
		this.visitRespository = visitRespository;
	}

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visit findById(Long id) {
		return visitRespository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return visitRespository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRespository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		visitRespository.deleteById(id);
	}

}
