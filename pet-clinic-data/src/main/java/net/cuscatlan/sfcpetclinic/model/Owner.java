package net.cuscatlan.sfcpetclinic.model;

import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Owner extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets;

}
