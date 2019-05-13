pipeline {
  agent none
  stages {
    stage('Build') {
      parallel {
        stage('Built-test-1') {
          steps {
            sh '''echo ${env.TEST}
build job: \'Build-test-1\''''
          }
        }
        stage('Build-test-2') {
          steps {
            build 'Build-test-2'
          }
        }
        stage('Build-test-3') {
          steps {
            build 'Build-test-3'
          }
        }
      }
    }
    stage('Build-test-4') {
      steps {
        build 'Build-test-4'
      }
    }
  }
  environment {
    TEST = '5'
  }
}