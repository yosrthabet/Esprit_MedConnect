package tn.esprit.medconnect.dossier_service.entities;

import java.time.LocalDateTime;

public class Consultation {

    private String id;
    private Long praticienId;
    private Long rendezVousId;
    private LocalDateTime dateConsultation;
    private String motif;
    private String diagnostic;
    private String observations;
    private Constantes constantes;
}
