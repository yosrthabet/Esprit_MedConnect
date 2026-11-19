package tn.esprit.medconnect.dossier_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/api/dossiers/ping")
    public String ping() {
        return "dossier-service OK";
    }
}
