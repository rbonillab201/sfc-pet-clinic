package net.cuscatlan.sfcpetclinic.service;

import net.cuscatlan.sfcpetclinic.model.Owner;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

public interface OwnerService extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}
