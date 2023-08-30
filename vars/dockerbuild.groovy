def call(){
  steps{
          script {
                dockerImage = docker.build registry + ":$BUILD_NUMBER"
              }
            }
        }
