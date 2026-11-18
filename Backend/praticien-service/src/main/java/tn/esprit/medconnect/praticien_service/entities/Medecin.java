package tn.esprit.medconnect.praticien_service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Medecin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	private String prenom;

	@Column(unique = true)
	private String numeroOrdre;

	private String telephone;

	private boolean conventionneCnam;

	private double tarifConsultation;

	@Enumerated(EnumType.STRING)
	private StatutMedecin statut = StatutMedecin.EN_ATTENTE;

	// Plusieurs médecins appartiennent à une spécialité
	@ManyToOne
	private Specialite specialite;

	// Plusieurs médecins exercent dans un cabinet
	@ManyToOne
	private Cabinet cabinet;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }

	public String getPrenom() { return prenom; }
	public void setPrenom(String prenom) { this.prenom = prenom; }

	public String getNumeroOrdre() { return numeroOrdre; }
	public void setNumeroOrdre(String numeroOrdre) { this.numeroOrdre = numeroOrdre; }

	public String getTelephone() { return telephone; }
	public void setTelephone(String telephone) { this.telephone = telephone; }

	public boolean isConventionneCnam() { return conventionneCnam; }
	public void setConventionneCnam(boolean conventionneCnam) { this.conventionneCnam = conventionneCnam; }

	public double getTarifConsultation() { return tarifConsultation; }
	public void setTarifConsultation(double tarifConsultation) { this.tarifConsultation = tarifConsultation; }

	public StatutMedecin getStatut() { return statut; }
	public void setStatut(StatutMedecin statut) { this.statut = statut; }

	public Specialite getSpecialite() { return specialite; }
	public void setSpecialite(Specialite specialite) { this.specialite = specialite; }

	public Cabinet getCabinet() { return cabinet; }
	public void setCabinet(Cabinet cabinet) { this.cabinet = cabinet; }

}
