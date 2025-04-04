#MyLocat - Backend API

This is the backend API for "MyLocat", a personal safety web application designed to work with a wearable device. In emergency situations, users can trigger alerts via the wearable, which are handled by this Spring Boot API.

This backend is responsible for:
- Managing emergency contact data
- Storing user location coordinates
- Handling emergency alert triggers

---

#Project Status

#Finished
- Spring Boot project setup
- REST API endpoints using hardcoded data:
  - `GET /contacts`
  - `POST /contacts`
  - `DELETE /contacts/{id}`

#In Progress
- Connecting to a database (H2 → PostgreSQL)
- Creating models/entities for persistence
- Building logic for alerts and location storage

#Planned / Next
- Google Maps API integration (for coordinates)
- Role-based authentication (optional)
- Notification system (SMS/email)

---

#Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** H2 (dev), PostgreSQL (prod)
- **API Style:** RESTful
- **Testing:** Postman

---

#API Endpoints

| Method | Endpoint           | Description                     |
|--------|--------------------|---------------------------------|
| GET    | `/contacts`        | Get all emergency contacts      |
| POST   | `/contacts`        | Add a new emergency contact     |
| DELETE | `/contacts/{id}`   | Delete a contact by ID          |
| POST   | `/location`        | Save user's last known location |
| POST   | `/alert`           | Trigger an emergency alert      |

---

#Related Projects

[mylocat-frontend] (Coming soon)
This API will be consumed by a React frontend (currently in development).

---

#Author

Linda Stumpf. Full-stack learner building real-world apps with Spring Boot & React.

---

#Disclaimer

This project is a learning-driven work in progress. Features will expand as skills grow.
