package net.cuscatlan.sfcpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 5, 2020
 *
 */

@Data
@Table(name = "vets")
@Entity
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToMany
	@JoinTable(name = "vets_specialties", joinColumns = @JoinColumn(name = "vet_id"),
	inverseJoinColumns = @JoinColumn(name = "specialty_id"))
	Set<Specialty> specialties = new HashSet<>();

}
