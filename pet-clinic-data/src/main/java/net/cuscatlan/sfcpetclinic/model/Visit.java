package net.cuscatlan.sfcpetclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 16, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Visit extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate date;
	private String description;
	private Pet pet;

 
}
