pipeline {
    agent any
   
    stages {
         stage('Installation de maven4') {
            steps {
                withMaven{
                   sh 'mvn clean install '
                }
            }
        }

        stage('clean et Installation les dependances') {
            steps {
                  withMaven{
                    sh 'mvn -v'
                }
                
            }
        }
         stage('Execution des tests') {
            steps {
                withMaven{
                    sh 'mvn  test'
                }
                
            }
        }
       
    }
     post{
            always{
                junit 'target/surefire-reports/**/*.xml'
            }
        }
}