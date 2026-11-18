# MedConnect

Plateforme de prise de rendez-vous et de suivi médical, construite en microservices.

## Sujet
Aujourd'hui, les rendez-vous médicaux se prennent par téléphone et les dossiers et ordonnances restent sur papier.
MedConnect permet au patient de trouver un médecin, réserver un créneau, suivre ses consultations, ses ordonnances
et ses factures, et offre aux médecins, secrétaires et pharmaciens un outil commun et sécurisé.

## Membres
| Membre | Microservice |
|---|---|
| Yosr Thabet | praticien-service |
| Sarra Ben Othmen | agenda-service |
| Yasmine Ben Nacer | rendezvous-service |
| Mohamed Mehdi Fejani | dossier-service |
| Ahmed El Arbi | ordonnance-service |
| Moemen Samaali | facturation-service |
| Toute l'équipe | parcours-service (commun) |

## Architecture
| Service | Techno | Port | Base |
|---|---|---|---|
| api-gateway | Spring Cloud Gateway | 8080 | — |
| discovery-service | Eureka Server | 8761 | — |
| config-server | Spring Cloud Config | 8888 | — |
| praticien-service | Spring Boot | 8081 | PostgreSQL |
| agenda-service | Spring Boot | 8082 | PostgreSQL |
| rendezvous-service | Spring Boot | 8083 | PostgreSQL |
| dossier-service | Spring Boot | 8084 | MongoDB |
| ordonnance-service | Spring Boot | 8085 | MongoDB |
| facturation-service | Spring Boot | 8086 | PostgreSQL |
| parcours-service | Node.js / Express | 3000 | MongoDB |

Sécurité : Keycloak (port 8180) · Messagerie : RabbitMQ (port 5672) · Frontend : Angular (port 4200)

Les diagrammes sont dans `Documentation/Diagrams`.

## Lancement
Ordre de démarrage (dans chaque dossier de `Backend/`) :
1. `config-server` : `mvn spring-boot:run`
2. `discovery-service` : `mvn spring-boot:run` (tableau de bord : http://localhost:8761)
3. Les microservices : `mvn spring-boot:run` (et `npm start` pour parcours-service)
4. `api-gateway` : `mvn spring-boot:run`
5. Frontend : `cd Frontend && npm install && ng serve`