package net.cuscatlan.sfcpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.cuscatlan.sfcpetclinic.model.Owner;
import net.cuscatlan.sfcpetclinic.model.Vet;
import net.cuscatlan.sfcpetclinic.service.OwnerService;
import net.cuscatlan.sfcpetclinic.service.VetService;
import net.cuscatlan.sfcpetclinic.service.map.OwnerServiceMap;
import net.cuscatlan.sfcpetclinic.service.map.VetServiceMap;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 10, 2020
 *
 */
@Component
public class LoadData implements CommandLineRunner {
	
	public final OwnerService ownerService;
	public final VetService vetService;
	
	

	public LoadData(OwnerService ownerService, VetService vetService) {
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Renato");
		owner1.setLastName("Bonilla");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Piero");
		owner2.setLastName("Bonilla");
		
		ownerService.save(owner2);
		
		System.out.println("Owner Loaded");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Gaby");
		vet1.setLastName("Bonilla");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Karla");
		vet2.setLastName("Bonilla");
		
		vetService.save(vet2);
		
		System.out.println("Vet Loaded");

	}

}
