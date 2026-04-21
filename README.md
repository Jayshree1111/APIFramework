# API Test Automation Framework

An enterprise-grade REST API test automation framework built with **Java + Rest Assured + TestNG**, featuring structured test suites, JSON serialization/deserialization, and CI/CD integration via GitHub Actions.

---

## 🛠️ Tech Stack

| Tool | Version | Purpose |
|------|---------|---------|
| Java | 11 | Primary language |
| [Rest Assured](https://rest-assured.io/) | 6.0.0 | API testing & HTTP request handling |
| [TestNG](https://testng.org/) | 7.12.0 | Test runner & assertions |
| Jackson Databind | 2.21.2 | JSON serialization / deserialization |
| Log4j2 | 2.23.1 | Test execution logging |
| Maven | 3.x | Build & dependency management |
| GitHub Actions | — | CI/CD pipeline |

---

## 📁 Project Structure

```
APIFramework/
├── .github/
│   └── workflows/              # GitHub Actions CI/CD pipeline
├── src/
│   └── test/
│       └── java/
│           ├── api/            # API endpoint constants & request builders
│           ├── tests/          # Test classes (GET, POST, PUT, DELETE)
│           ├── models/         # POJO classes for request/response payloads
│           └── utils/          # Reusable helpers (auth, config, base setup)
├── pom.xml                     # Maven dependencies & build config
├── suite.xml                   # TestNG suite configuration
└── .gitignore
```

---

## ✅ Key Features

- **Rest Assured** — Fluent API for writing readable, chainable HTTP request/response validations
- **TestNG Suite** — Configurable test execution via `suite.xml`; supports parallel runs and test grouping
- **Jackson for POJO mapping** — Request/response bodies serialized and deserialized as typed Java objects
- **Log4j2 logging** — Full execution logs captured at each test step for easy debugging
- **Maven Surefire** — Suite file passed as a parameter (`-Dsuite=smoke`) for flexible CI execution
- **GitHub Actions** — Automated pipeline runs tests on every push/pull request

---

## 🚀 Getting Started

### Prerequisites
- Java 11 or higher
- Maven 3.x
- An IDE (IntelliJ IDEA recommended)

### Installation

```bash
# Clone the repository
git clone https://github.com/Jayshree1111/APIFramework.git
cd APIFramework

# Build the project
mvn clean install -DskipTests
```

### Running Tests

```bash
# Run the full test suite
mvn test -Dsuite=suite

# Run smoke tests only (if configured)
mvn test -Dsuite=smoke

# Run regression suite
mvn test -Dsuite=regression
```

---

## ⚙️ CI/CD Pipeline

Tests run automatically via **GitHub Actions** on every push and pull request to the `master` branch. The workflow:
1. Checks out the code
2. Sets up Java 11 (Temurin)
3. Runs `mvn test` with the default suite
4. Uploads test reports as build artifacts

---

## 🧪 Test Coverage

The framework covers the full CRUD lifecycle of REST API endpoints:

| HTTP Method | Test Scenario |
|-------------|--------------|
| `GET` | Retrieve single & collection resources; validate status codes & response schema |
| `POST` | Create resources; validate response body & location headers |
| `PUT` / `PATCH` | Update resources; assert field-level changes |
| `DELETE` | Delete resources; verify 204/404 responses |

Additional coverage:
- **Authentication** — Bearer token / API key header injection
- **Request chaining** — Response values extracted and passed to subsequent requests
- **Schema validation** — JSON response structure validated against expected models
- **Negative testing** — 4xx/5xx error responses asserted for invalid inputs

---

## 📐 Design Principles

- **Separation of concerns** — Test logic, API utilities, and POJO models are cleanly separated
- **Reusability** — Base request setup (base URI, headers, auth) configured once and reused across all tests
- **Maintainability** — Endpoint URLs and test data centralized for easy updates
- **Extensibility** — New API modules can be added without changing existing framework infrastructure

---

## 👩‍💻 Author

**Jayshree** — Senior QA Automation Engineer | 5+ years of experience in enterprise test automation

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue)]([https://www.linkedin.com/in/jayshree-qa/](https://www.linkedin.com/in/jayshree-panchani-6416401aa/))

---

## 📄 License

This project is for demonstration and portfolio purposes.
