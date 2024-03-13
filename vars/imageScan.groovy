def call(dockeruser, dockerapp){
  sh "trivy image ${dockeruser}/${dockerapp}:latest" > scan.txt
  sh 'cat scan.txt'
}
