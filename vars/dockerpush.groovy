def call(){

              docker.withRegistry( '', registryCredential ) {          
             sh 'dockerImage.push("$BUILD_NUMBER")'    
              }


}
