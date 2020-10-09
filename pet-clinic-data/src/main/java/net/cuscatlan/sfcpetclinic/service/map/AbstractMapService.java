package net.cuscatlan.sfcpetclinic.service.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 8, 2020
 *
 */
public abstract class AbstractMapService<T, ID> {
	
	protected Map<ID, T> map = new HashMap<>();
	
	Set<T> findAll(){
		return new HashSet<>(map.values());
	}
	
	T findById(ID id){
		return map.get(id);
	}
	
	T save(ID id,T object) {
		map.put(id, object);
		return object;
	}
	
	void delete(T object) {
		map.entrySet().removeIf(dato -> dato.getValue().equals(object));
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	

}
