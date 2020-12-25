// library identifier: 'devops-ws-demo@master', retriever: modernSCM([
//     $class: 'GitSCMSource',
//     remote: 'https://github.com/devops-ws/jenkins-shared-library',
//     traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]
// ])

@Library('devops-ws-demo') _
//@Library('devops-ws-demo@test') _

pipeline {
    agent any

    stages {
        stage('Demo') {
            steps {
                script {
                    mvn.fake()
                }
            }
        }
    }
}
