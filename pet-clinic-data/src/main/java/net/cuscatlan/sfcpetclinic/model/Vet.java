package net.cuscatlan.sfcpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Set<Specialty> specialties = new HashSet<>();

}
