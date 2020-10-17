package net.cuscatlan.sfcpetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 17, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Specialty extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;

}
