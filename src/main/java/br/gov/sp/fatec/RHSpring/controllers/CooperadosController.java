package br.gov.sp.fatec.RHSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CooperadosController {
	
	@RequestMapping("/RHSpring/form")
	public String form() {
		return "formCooperado";
	}

}
