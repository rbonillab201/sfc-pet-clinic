package net.cuscatlan.sfcpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import net.cuscatlan.sfcpetclinic.model.Owner;
import net.cuscatlan.sfcpetclinic.model.Pet;
import net.cuscatlan.sfcpetclinic.model.PetType;
import net.cuscatlan.sfcpetclinic.model.Specialty;
import net.cuscatlan.sfcpetclinic.model.Vet;
import net.cuscatlan.sfcpetclinic.service.OwnerService;
import net.cuscatlan.sfcpetclinic.service.PetService;
import net.cuscatlan.sfcpetclinic.service.PetTypeService;
import net.cuscatlan.sfcpetclinic.service.SpecialtyService;
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
	public final PetTypeService petTypeService;
	public final SpecialtyService specialtyService;

	public LoadData(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
		this.petTypeService = petTypeService;
		this.ownerService = ownerService;
		this.vetService = vetService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		int conteo = ownerService.findAll().size();
		if(conteo == 0) {
			loadData();
		}


	}


	public void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType dogSaved = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType catSaved = petTypeService.save(cat);
		
		System.out.println("PetTypes saved");
		
		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty surgerySaved = specialtyService.save(surgery);
		
		Specialty dentistry = new Specialty();
		dentistry.setDescription("Dentistry");
		Specialty dentistrySaved = specialtyService.save(dentistry);
		
		System.out.println("Specialties saved");
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Renato");
		owner1.setLastName("Bonilla");
		owner1.setAddress("Colonia 3 de mayo");
        owner1.setCity("San Salvador");
        owner1.setTelephone("78874661");
        
        Pet renatoDog = new Pet();
        renatoDog.setBirthDate(LocalDate.now());
        renatoDog.setOwner(owner1);
        renatoDog.setPetName("Pirata");
        renatoDog.setPetType(dogSaved);
        
        owner1.getPets().add(renatoDog);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Piero");
		owner2.setLastName("Bonilla");
		owner2.setAddress("Colonia 3 de mayo");
        owner2.setCity("San Salvador");
        owner2.setTelephone("78874661");	
        
        Pet pieroDog = new Pet();
        pieroDog.setBirthDate(LocalDate.now());
        pieroDog.setOwner(owner2);
        pieroDog.setPetName("Parcero");
        pieroDog.setPetType(dogSaved);
        
        owner2.getPets().add(pieroDog);
		
		ownerService.save(owner2);
		
		Owner owner3 = new Owner();
		owner3.setFirstName("Tito");
		owner3.setLastName("Bonilla");
		owner3.setAddress("Colonia 3 de mayo");
        owner3.setCity("San Salvador");
        owner3.setTelephone("78874661");
        
        Pet titoCat = new Pet();
        titoCat.setBirthDate(LocalDate.now());
        titoCat.setOwner(owner3);
        titoCat.setPetName("Cata");
        titoCat.setPetType(catSaved);
        
        owner3.getPets().add(titoCat);
		
		ownerService.save(owner3);		
		
		System.out.println("Owner Loaded");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Gaby");
		vet1.setLastName("Bonilla");
		vet1.getSpecialties().add(surgerySaved);

		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Karla");
		vet2.setLastName("Bonilla");
		vet2.getSpecialties().add(dentistrySaved);
		
		vetService.save(vet2);
		
		System.out.println("Vet Loaded");
	}

}
