pipeline {
    agent any
    /*tools{
        maven 'maven_3_5_0'
    }*/
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Java-Techie-jt/devops-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t sukhanth1/sk-automation:1.0 .'
                }
            }
        }
        stage('Push image to Hub'){
            steps{
                script{
                   withCredentials([string(credentialsId: 'dockerlog', variable: 'docker')]) {
                   sh 'docker login -u sukhanth1 -p ${docker}'
}
                   sh 'docker push sukhanth1/sk-automation:1.0'
                }
            }
        }
        stage('Deploy to k8s'){
            steps{
                script{
                    kubernetesDeploy (configs: 'deploymentservice.yaml',kubeconfigId: 'll')
                }
            }
        }
    }
}
