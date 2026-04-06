pipeline{
    agent any
    
    stages{
        stage("Checkout Code"){
            steps{
                echo "Pulling the code from the cloud"
                checkout scm
            }
        }

        stage("Run automated tests"){
            steps{
                echo "Running automated tests"
                bat "mvn clean test"
            }
        }

        stage("Package Application"){
            steps{
                echo "Packaging the application"
                bat "mvn clean package"
            }
        }

        
    }
}
//new comments added