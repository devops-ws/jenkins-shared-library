library identifier: 'jenkins_zh@master', retriever: modernSCM([
    $class: 'GitSCMSource',
    remote: 'https://github.com/devops-ws/jenkins-shared-library',
    traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait']]
])

pipeline {
    agent any

    stages {
        stage('Demo') {
            steps {
                mvn.fake()
            }
        }
    }
}
