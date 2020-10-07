package net.cuscatlan.sfcpetclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class Pet extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
}
