node {
    stage('Checkout') {
        try{
            timeout(time: 1, unit:'MINUTES'){
                sh "sleep 3"
                echo "mvn clean compile"
            }
        }catch(Exception){
            currentBuild.result = 'FAILED'
        }
    }
    stage('Unit Test') {
        try{
            echo "mvn clean test"
    		echo "junit report.xml"
            int totalFailed = 5
            if(totalFailed >= 4){
                throw new Exception()
            }
        }catch(Exception){
            currentBuild.result = 'UNSTABLE'
        }
    }
}