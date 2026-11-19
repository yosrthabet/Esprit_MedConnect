package tn.esprit.medconnect.agenda_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

	@GetMapping("/api/agenda/ping")
	public String ping() {
		return "agenda-service OK";
	}

}
