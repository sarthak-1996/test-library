def call(dockeruser, dockerapp){
  withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
  )]){
    sh "docker login -u ${USER} -p ${PASS}"
  }
  sh "docker push ${dockeruser}/${dockerapp}:latest"
  
}
