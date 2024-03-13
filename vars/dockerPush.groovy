def call(string dockeruser, string imagetag){
  sh "docker build -t "${dockeruser}/"${imagetag}":latest ."
}
