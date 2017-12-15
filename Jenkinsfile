node {
    stage('Checkout') {
        try{
            timeout(time: 1, unit:'MINUTES'){
                sh "sleep 62"
                echo "mvn clean compile"
            }
        }catch(Exception){
            currentBuild.result = 'UNSTABLE'
        }
    }
}