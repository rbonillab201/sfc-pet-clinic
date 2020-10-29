package net.cuscatlan.sfcpetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cuscatlan.sfcpetclinic.model.Visit;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 29, 2020
 *
 */

public interface VisitRespository extends JpaRepository<Visit, Long> {

}
