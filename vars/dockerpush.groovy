def call(){

             docker.withRegistry( '', registryCredential ) {
                sh 'docker push $registry:$BUILD_NUMBER'
              }


}
