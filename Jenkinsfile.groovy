pipeline {
    agent any

    stages {
        stage('Phase1: Checkout Git') {
            steps {
                // Checkout the code from the specific Git branch
                git branch: 'main', url: 'https://github.com/nidhallchaabene/DevSecOps.git'
            }
        }

        stage('Phase2: The Build') {
            steps {
                // Clean and compile using Maven
                sh 'mvn clean compile'
            }
        }
        
        stage('Phase3: SonarQube Analysis'){
            steps{
                //analysis of code using sonarqube
                sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar123.'
            }
        }
        
         stage('Phase4: JUnit/Mockito Tests') {
            steps {
                // Run JUnit and Mockito tests
                sh 'mvn test' 
            }
        }
           
           
        stage('Phase5: Deploy to Nexus') {
            steps{
                 // Deploy your Maven project to Nexus
                 sh 'mvn deploy'

                }
            }
            
            stage('Docker Image') {
            steps {
                sh 'docker build -t nidhalchaabene .'
            }
        }
        
        
          stage('Docker Image Push') {
            steps {
                script {
                    sh 'echo "docker123." | docker login --username "nidhal" --password-stdin'
                    sh 'docker tag nidhalchaabene nidhal/devops:latest'
                    sh 'docker push nidhal/devops:latest'
                }
            }
        }
        
         stage('Docker Compose') {
            steps {
                sh 'docker compose up -d'
            }
        }
    }
    
        }
