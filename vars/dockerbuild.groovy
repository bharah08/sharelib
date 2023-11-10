def call(){
 dockerImage = docker.build registry + ":$BUILD_NUMBER"
}
