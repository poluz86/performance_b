#!groovy

import jenkins.model.Jenkins
import hudson.model.User
import hudson.security.Permission
import hudson.EnvVars

pipeline {
	agent any

	stages {
	    stage('Compile') {
			steps {
	    		timeout(time: 1, unit:'MINUTES'){
	    			sh "sleep 1"
		    		//sh "./task.sh"
                    //sh 'groovy sample.groovy'
                    println 'HOLA GROOVY'
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
