pipeline {
  agent any

  tools {
    maven 'mvn-3.3.9'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
  }  
}