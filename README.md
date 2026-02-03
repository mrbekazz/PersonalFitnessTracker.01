# Personal Fitness Tracker API 💪

## Description
This is a RESTful Web Service developed as part of **Assignment 4 – Project Milestone 2**. 
The project allows users to track their fitness activities and physical parameters. It is built using **Java** and **Spring Boot**, with **PostgreSQL** as the database.

## Technologies Used 🛠️
* **Language:** Java 17+
* **Framework:** Spring Boot 3.2.1
* **Database:** PostgreSQL
* **Build Tool:** Maven
* **Data Format:** JSON

## Prerequisites 📋
Before running the project, make sure you have the following installed:
1.  JDK 17 or higher
2.  PostgreSQL Database
3.  Maven (optional, if using IntelliJ IDEA)

## Database Configuration 🗄️
The application connects to a PostgreSQL database. 
* **Database Name:** `Personal Fitness Tracker`
* **Default User:** `postgres`
* **Default Password:** `1212`

> **Note:** You can change these credentials in `src/main/java/fitness/DatabaseConnection.java`.

## How to Run 🚀
1.  Clone the repository:
    ```bash
    git clone [https://github.com/YOUR_USERNAME/fitness-tracker-api.git](https://github.com/YOUR_USERNAME/fitness-tracker-api.git)
    ```
2.  Open the project in **IntelliJ IDEA**.
3.  Make sure PostgreSQL is running and the database is created.
4.  Run `FitnessRestApplication.java`.
5.  The server will start at: `http://localhost:8080`

## API Endpoints 📡

### 1. Get All Users
Returns a list of all registered users in JSON format.

* **URL:** `/api/users`
* **Method:** `GET`
* **Response Example:**
    ```json
    [
      {
        "id": 1,
        "name":
