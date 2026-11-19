package tn.esprit.medconnect.dossier_service.entities;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dossiers")
public class DossierPatient {

    @Id
    private String id;
    private Long patientId;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String groupeSanguin;
    private List<String> allergies;
    private List<String> antecedents;
    private LocalDate dateCreation;
    private List<Consultation> consultations;
}
