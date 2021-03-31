pipeline {
    agent any
    stages {
        stage('Clean stage') {
            steps {
                sh  'mvn clean'
            }
        }
        stage('Compiling stage') {
            steps {
                sh  'mvn compile'
            }
        }
        stage('Testing stage') {
            steps {
                sh  'mvn test'
            }
        }
        stage('Deploy stage') {
            steps {
                sh  'mvn deploy'
            }
        }
    }
}