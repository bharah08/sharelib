def call(){

              docker.withRegistry( '', registryCredential ) {          
             dockerImage.push("$BUILD_NUMBER")   
              }


}
