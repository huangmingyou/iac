def call(repo){
     dir("code"){
        checkout([$class: 'GitSCM', branches: [[name: "${tag}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[ url: "${repo}"]]])

}
}
