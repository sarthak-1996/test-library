def call(string dockeruser, string imagename){
  sh "docker build -t "${dockeruser}/"${imagename}":latest ."
}
