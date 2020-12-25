package io.github.devops.ws;

class Maven {
    def Build() {
        sh script: 'mvn clean package', label: 'Maven build'
    }

    def Fake() {
        echo 'do nothing but demonstration'
    }
}
