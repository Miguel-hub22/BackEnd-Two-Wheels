package com.twowheels.twowheels.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two-wheels")
public class TwoWheelsController {
	
	@GetMapping
	public String twowheels() {
		return " Two Wheels";  /* tudo dentro de aspas vai aparecer na pagina*/ 
		

}
}