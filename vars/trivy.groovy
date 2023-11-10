def call(){
sh 'trivy image $registry:$BUILD_NUMBER'
}
