def call(){
 sh ' dockerImage = docker.build registry + ":$BUILD_NUMBER" '

        }
