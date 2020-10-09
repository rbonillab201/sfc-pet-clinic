package net.cuscatlan.sfcpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día Oct 8, 2020
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping({"", "/", "index", "index.html"})
	String index(Model model) {

		model.addAttribute("title", "Index Page");
		return "index";
	}

}
