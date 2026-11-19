package tn.esprit.medconnect.agenda_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Version;
import java.time.LocalDate;
import java.time.LocalTime;

// Créneau concret d'un médecin : LIBRE, BLOQUE ou RESERVE
// Un même créneau ne peut pas exister deux fois pour un médecin
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"medecin_id", "date_creneau", "heure_debut"}))
public class Creneau {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "medecin_id", nullable = false)
	private Long medecinId;

	@Column(name = "date_creneau", nullable = false)
	private LocalDate date;

	@Column(name = "heure_debut", nullable = false)
	private LocalTime heureDebut;

	private LocalTime heureFin;

	@Enumerated(EnumType.STRING)
	private StatutCreneau statut = StatutCreneau.LIBRE;

	// Référence vers rendezvous-service quand le créneau est RESERVE
	private Long rdvId;

	// Verrou optimiste : empêche deux réservations simultanées du même créneau
	@Version
	private Long version;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Long getMedecinId() { return medecinId; }
	public void setMedecinId(Long medecinId) { this.medecinId = medecinId; }

	public LocalDate getDate() { return date; }
	public void setDate(LocalDate date) { this.date = date; }

	public LocalTime getHeureDebut() { return heureDebut; }
	public void setHeureDebut(LocalTime heureDebut) { this.heureDebut = heureDebut; }

	public LocalTime getHeureFin() { return heureFin; }
	public void setHeureFin(LocalTime heureFin) { this.heureFin = heureFin; }

	public StatutCreneau getStatut() { return statut; }
	public void setStatut(StatutCreneau statut) { this.statut = statut; }

	public Long getRdvId() { return rdvId; }
	public void setRdvId(Long rdvId) { this.rdvId = rdvId; }

	public Long getVersion() { return version; }

}
