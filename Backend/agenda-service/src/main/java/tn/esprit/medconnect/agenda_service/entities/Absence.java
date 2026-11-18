package tn.esprit.medconnect.agenda_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

// Congé ou absence d'un médecin : bloque les créneaux de la période
@Entity
public class Absence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long medecinId;

	private LocalDate dateDebut;

	private LocalDate dateFin;

	private String motif;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Long getMedecinId() { return medecinId; }
	public void setMedecinId(Long medecinId) { this.medecinId = medecinId; }

	public LocalDate getDateDebut() { return dateDebut; }
	public void setDateDebut(LocalDate dateDebut) { this.dateDebut = dateDebut; }

	public LocalDate getDateFin() { return dateFin; }
	public void setDateFin(LocalDate dateFin) { this.dateFin = dateFin; }

	public String getMotif() { return motif; }
	public void setMotif(String motif) { this.motif = motif; }

}
