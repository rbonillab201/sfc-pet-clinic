package net.cuscatlan.sfcpetclinic.model;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Data;



/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@MappedSuperclass
public class Person extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;

}
