package br.com.alura.leilao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		return "redirect:/leiloes";
	}
	
	@GetMapping("/finalizar")
	public void finalizar() {
		System.out.println("\n\nFinalizando aplicacao....\n\n");
		System.exit(1);
	}

}
