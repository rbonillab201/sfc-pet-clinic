package net.cuscatlan.sfcpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 17, 2020
 *
 */

@Data
@Table(name = "specialties")
@Entity
public class Specialty extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "description")
	private String description;

}
