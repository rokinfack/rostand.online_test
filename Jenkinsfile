pipeline {
    agent any
    options {
        // Timeout counter starts AFTER agent is allocated
        timeout(time: 1, unit: 'SECONDS')
    }
    stages {
        stage('Installation de maven') {
            steps {
                sh 'mvn -v'
            }
        }

        stage('clean et Installation les dependances') {
            steps {
                sh 'mvn -v'
            }
        }
         stage('Execution des tests') {
            steps {
                sh 'mvn  test'
            }
        }
        post{
            always{
                echo 'affichage des rapports'
            }
        }
    }
}