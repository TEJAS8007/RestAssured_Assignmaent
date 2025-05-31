# 🧪 ReqRes API Automation Framework

A lightweight and modular API test automation framework built with Java and TestNG using the [ReqRes](https://reqres.in/) public API. This project was developed as part of an interview assignment to demonstrate API testing capabilities using industry-standard tools and design practices.

---

## 🚀 Features

- ✅ REST API testing using **RestAssured**
- ✅ Dynamic test data generation using **Faker**
- ✅ JSON serialization/deserialization using **Jackson ObjectMapper**
- ✅ Modular and reusable code structure
- ✅ Externalized test data and configuration
- ✅ Clear and professional test reports with **ExtentReports**
- ✅ Maven-based build and dependency management
- ✅ Environment-ready with `testng.xml` configuration

---

## 🛠️ Tech Stack

- Java
- TestNG
- RestAssured
- Faker
- Jackson
- ExtentReports
- Maven

---

## 📁 Project Structure

API_ASSIGNMENT/
├── src/test/java
│ ├── com.QA.Endpoints # API routes and endpoint methods
│ │ ├── API_Endpoints.java
│ │ └── Routes.java
│ ├── com.QA.Payloads # POJOs for request/response
│ │ └── User_Payload.java
│ ├── com.QA.tests # Test classes
│ │ └── User_Test.java
│ └── com.QA.utilities # Utils like config and reports
│ ├── ExtentReportManager.java
│ └── Property_Reader.java
├── src/test/resources
│ └── Data/Headers.properties
│ └── log4j2.xml
├── Reports/
│ └── Api_assignment_Report2025.html
├── testng.xml
└── pom.xml

yaml
Copy
Edit

---

## 🧪 Sample Test Flow

1. Generate a random name and job using Faker
2. Serialize it into a JSON payload
3. Send a `POST` request to create a user
4. Validate the `201 Created` response
5. Parse and verify response attributes (e.g., `id`, `createdAt`)

---

## 🧾 How to Run

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/your-username/reqres-api-framework.git
   cd reqres-api-framework
Install Dependencies
Ensure Maven is installed and run:

bash
Copy
Edit
mvn clean install
Run Tests via TestNG

bash
Copy
Edit
mvn test
View Reports
After execution, navigate to:

swift
Copy
Edit
/Reports/Api_assignment_Report2025.html
🧠 Future Enhancements
Add CI support (GitHub Actions / Jenkins)

Parameterize tests for more coverage

Include negative test scenarios

Support for multiple environments via config files

🤝 Let's Connect
Feel free to connect or provide feedback on LinkedIn!
🔗 Your LinkedIn Profile

