pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build'
      }
    }
    stage('Test') {
      parallel (
        'unit_test': {
             echo 'Unit Test'
        },
        'code_analisis': {
            echo 'Code Analisis'
        }
      )
    }
    stage('Deploy') {
      steps {
        echo 'Deploy Step 1'
        echo 'Deploy Step 2'
      }
    }
  }
}
