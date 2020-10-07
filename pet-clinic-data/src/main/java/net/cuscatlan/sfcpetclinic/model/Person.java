package net.cuscatlan.sfcpetclinic.model;


import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;

}
