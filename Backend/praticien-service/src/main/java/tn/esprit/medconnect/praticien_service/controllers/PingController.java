package tn.esprit.medconnect.praticien_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@GetMapping("/api/praticiens/ping")
	public String ping() {
		return "praticien-service OK";
	}

}
