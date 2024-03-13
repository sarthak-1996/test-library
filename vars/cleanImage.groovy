def call(dockeruser, appname){
  sh "docker rmi ${dockeruser}/${appname}:latest"
}
