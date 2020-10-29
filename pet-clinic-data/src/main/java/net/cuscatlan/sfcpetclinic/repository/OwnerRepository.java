package net.cuscatlan.sfcpetclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cuscatlan.sfcpetclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
