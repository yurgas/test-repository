pipeline {
  agent any
  stages {
    stage('Stage 1') {
      steps {
        echo 'Step 1'
        echo 'Step 2'
        echo 'branch test13'
        echo sh(returnStdout: true, script: 'env')
      }
    }
    stage('Stage 2') {
      steps {
      parallel (
        'step 1': {
             sh 'git diff --name-only master'
        },
        'step 2': {
            echo 'Step 2'
        },
        'step 3': {
            echo 'Step 3'
        }
      )
      }
    }
    stage('Stage 3') {
      steps {
        echo 'Step 1'
      }
    }
  }
}
