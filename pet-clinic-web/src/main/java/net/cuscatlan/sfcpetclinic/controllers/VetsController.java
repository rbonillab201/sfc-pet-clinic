package net.cuscatlan.sfcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.cuscatlan.sfcpetclinic.service.VetService;


@Controller
//@RequestMapping("/vets")
public class VetsController {
	
	private final VetService vetService;	

	public VetsController(VetService vetService) {
		this.vetService = vetService;
	}

	@GetMapping({"/vets", "/vets.html"})
	public String findAll(Model model) {
		model.addAttribute("title", "Vets List");
		model.addAttribute("vets", vetService.findAll());
		System.out.println("vets -> " + vetService.findAll() );
		return "vets/list";	
	}

}
