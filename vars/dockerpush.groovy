def call(){


            steps{
script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push("$BUILD_NUMBER")
              }
            }
            }



}
