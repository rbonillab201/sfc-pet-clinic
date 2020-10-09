package net.cuscatlan.sfcpetclinic.service;

import java.util.Set;


/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 7, 2020
 *
 */

public interface CrudService<T, ID> {
	
	Set<T> findAll();
	T findById(ID id);
	T save(T object);
	void delete(T object);
	void deleteById(ID id);

}
