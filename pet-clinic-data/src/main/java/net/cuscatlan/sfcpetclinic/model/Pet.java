package net.cuscatlan.sfcpetclinic.model;

import java.time.LocalDate;

import lombok.Data;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
public class Pet {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
}
