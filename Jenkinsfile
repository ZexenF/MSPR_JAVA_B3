pipeline {
    agent any
    options {
    // This is required if you want to clean before build
    skipDefaultCheckout(true)
    }
    stages {
        stage('Get from git') {
            steps{
                cleanWs() //cleans current workspace
                dir('MSPR_JAVA_B3'){
                    git 'https://github.com/ZexenF/MSPR_JAVA_B3.git/'
                }
                dir('MSPR_JAVA_B3/src/main/resources'){
                    git 'https://github.com/ZexenF/MSPR_JAVA_B3_TXT'
                }
            }
        }
        stage('Build with mvn') {
            steps{
                dir('MSPR_JAVA_B3') {
                //Build with mvn using pom.xml in current folder
                //with cleaning previous compile files and jar archive generation
                    sh 'mvn -B clean package'
                }
            }
        }
        stage('run java app'){
            steps{
                dir('MSPR_JAVA_B3/target'){
                sh 'mkdir web/'
                //I run this archive using sh java 'java -jar-GENERATEDjar.jar'
                sh 'java -jar HTMLGenerator-1.0-SNAPSHOT-jar-with-dependencies.jar'
                }
            }
        }
        stage ('Deploy') {
            steps{
                dir('MSPR_JAVA_B3/target'){
                    //I send over ssh the agents files generated with the app to the webserver
                    sh 'scp -r web/ sshjenkins@msprb3.ddns.net:docker-apache-demo/src'
                }
            }
        }
    }
}
