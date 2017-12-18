pipeline {
	agent any

	stages {
	    stage('Compile') {
			steps {
	    		timeout(time: 1, unit:'MINUTES'){
	    			sh "sleep 1"
		    		//sh "./task.sh"
                    //sh 'groovy sample.groovy'
                    echo "$env.PATH"
		    		echo "$env.GROOVY_HOME"
                    echo "mvn clean compile"
   				}
	    	}
	    }
    	stage('Unit Test') {
    		steps {
    			echo "mvn clean test"
    			echo "junit report.xml"
    		}
    	}
    	stage('SonarQube') {
    		steps {
    			echo "sonar projectKey"
    			echo "Cyclomatic Complexity mining"
    			echo "Technical Debt mining"
    		}
    	}
    	stage('Promote') {
    		steps {
    			echo "mvn package"
    			echo "Promoting package"
    		}
    	}
   }
}
