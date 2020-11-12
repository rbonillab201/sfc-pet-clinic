package net.cuscatlan.sfcpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 16, 2020
 *
 */

@Data
@Table(name = "visits")
@Entity
public class Visit extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "visit_date")
	private LocalDate visitDate;
	@Column(name = "description")
	private String description;
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;

 
}
