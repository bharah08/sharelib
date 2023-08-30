def call(){
 sh """ 
 dockerImage = docker.build registry + ":$BUILD_NUMBER"
 docker.withRegistry( '', registryCredential ) {          
 dockerImage.push("$BUILD_NUMBER")
 """
}

        }
