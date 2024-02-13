# DevSecOps Pipeline for Java Application

This project implements a comprehensive DevSecOps pipeline for a Java application, integrating security practices into the development and deployment process. Leveraging Jenkins, Maven, SonarQube, Docker, Nexus, Git pre-commit hooks, OWASP Dependency-Check, and Ansible, the pipeline ensures continuous integration, delivery, and security of the software.


## Pipeline Steps:

1. **Phase1: Checkout Git:**
   - Fetches the source code from the specified Git repository branch.

2. **Phase2: The Build:**
   - Cleans and compiles the Java application using Maven.

3. **Phase3: SonarQube Analysis:**
   - Analyzes the code for quality and security issues using SonarQube.

4. **Phase4: JUnit/Mockito Tests:**
   - Executes JUnit and Mockito tests to ensure the functionality of the application.

5. **Phase5: OWASP Dependency-Check:**
   - Performs dependency analysis using OWASP Dependency-Check to identify and report known vulnerabilities.

6. **Phase6: Git Pre-commit Hooks:**
   - Enforces pre-commit hooks to ensure code quality and security checks before committing changes.

7. **Phase7: Deploy to Nexus:**
   - Deploys the Maven project artifacts to Nexus for version control and distribution.

8. **Phase8: Docker Image:**
   - Builds a Docker image for the Java application, packaging it with its dependencies.

9. **Phase9: Docker Image Push:**
   - Logs in to the Docker registry, tags the Docker image, and pushes it to the registry for distribution.

10. **Phase10: Docker Compose:**
    - Deploys the Docker containers using Docker Compose, orchestrating the deployment of the application.

11. **Phase11: Ansible Integration:**
    - Integrates Ansible for configuration management and automation, ensuring consistency and reliability in infrastructure provisioning.

