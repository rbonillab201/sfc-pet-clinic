package net.cuscatlan.sfcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 9, 2020
 *
 */
@Controller
@RequestMapping({"/owners"})
public class OwnersController {
	
	@GetMapping({"","/","/index","index.html"})
	public String listar(Model model) {
		model.addAttribute("title", "Owners List");
		return "owners/list";
	}

}
