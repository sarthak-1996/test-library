def call(jfrogip){
  withCredentials([(
        credentialsId: "jfrog",
        usernameVariable: "USER",
        passwordVariable: "PASS"
  )]){
      sh "curl -X PUT -u ${USER}:${PASS} /var/jenkins/workspace/project/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://${jfrogip}:8082/artifactory/example-repo-local/"
  }
  
}
