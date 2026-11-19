package tn.esprit.medconnect.ordonnance_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/api/ordonnances/ping")
    public String ping() {
        return "ordonnance-service OK";
    }
}