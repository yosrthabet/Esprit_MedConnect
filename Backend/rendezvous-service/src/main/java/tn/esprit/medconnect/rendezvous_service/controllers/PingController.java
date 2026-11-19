package tn.esprit.medconnect.rendezvous_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/api/rendezvous/ping")
    public String ping() {
        return "rendezvous-service OK";
    }
}