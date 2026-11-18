package tn.esprit.medconnect.agenda_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.DayOfWeek;
import java.time.LocalTime;

// Planning type d'un médecin : un jour de la semaine et une plage horaire
@Entity
public class PlanningHebdo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Référence vers praticien-service (pas de clé étrangère entre services)
	private Long medecinId;

	@Enumerated(EnumType.STRING)
	private DayOfWeek jour;

	private LocalTime heureDebut;

	private LocalTime heureFin;

	// Durée d'un créneau en minutes
	private int dureeCreneau;

	private boolean actif = true;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Long getMedecinId() { return medecinId; }
	public void setMedecinId(Long medecinId) { this.medecinId = medecinId; }

	public DayOfWeek getJour() { return jour; }
	public void setJour(DayOfWeek jour) { this.jour = jour; }

	public LocalTime getHeureDebut() { return heureDebut; }
	public void setHeureDebut(LocalTime heureDebut) { this.heureDebut = heureDebut; }

	public LocalTime getHeureFin() { return heureFin; }
	public void setHeureFin(LocalTime heureFin) { this.heureFin = heureFin; }

	public int getDureeCreneau() { return dureeCreneau; }
	public void setDureeCreneau(int dureeCreneau) { this.dureeCreneau = dureeCreneau; }

	public boolean isActif() { return actif; }
	public void setActif(boolean actif) { this.actif = actif; }

}
