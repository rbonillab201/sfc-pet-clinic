package net.cuscatlan.sfcpetclinic.service;

import java.util.Set;

import net.cuscatlan.sfcpetclinic.model.Owner;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

public interface OwnerServcie {
	
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Set<Owner> findAll();
	Owner save(Owner owner);

}
