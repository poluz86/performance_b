node {
    stage('Checkout') {
        try{
            timeout(time: 1, unit:'MINUTES'){
                sh "sleep 62"
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
            int totalFailed = 4
            if(totalFailed >= 4){
                throw new Exception()
            }
        }catch(Exception){
            echo "ERROR"
        }
    }
}