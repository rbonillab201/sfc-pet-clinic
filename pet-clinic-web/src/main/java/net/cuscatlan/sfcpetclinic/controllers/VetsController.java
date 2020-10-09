package net.cuscatlan.sfcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vets")
public class VetsController {

	@GetMapping({"","/","/index", "/index.html"})
	public String findAll(Model model) {
		model.addAttribute("title", "Vets List");
//		model.addAttribute("vets", vetService.findAll());
		return "vets/list";	
	}

}
