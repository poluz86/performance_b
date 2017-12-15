node {
    stage('Checkout') {
        try{
            timeout(time: 1, unit:'MINUTES'){
                sh "sleep 4"
                echo "mvn clean compile"
            }
        }catch(Exception){
            currentBuild.result = 'UNSTABLE'
        }
    }
}