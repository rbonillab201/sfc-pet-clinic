package net.cuscatlan.sfcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.cuscatlan.sfcpetclinic.service.OwnerService;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 9, 2020
 *
 */
@Controller
//@RequestMapping({"/owners"})
public class OwnersController {
	
	private final OwnerService ownerService;
	
	public OwnersController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}

	@GetMapping({"/owners","owners.html"})
	public String listar(Model model) {
		model.addAttribute("title", "Owners List");
		model.addAttribute("owners", ownerService.findAll());
		System.out.println("owners -> " + ownerService.findAll());
		return "owners/list";
	}
	
	@GetMapping("/owners/find")
	public String find(Model model) {
		model.addAttribute("pag", "owners");
		return "noimplemented";
	}

}
