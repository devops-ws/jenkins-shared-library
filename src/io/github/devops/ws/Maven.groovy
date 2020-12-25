package io.github.devops.ws;

def Build() {
    sh script: 'mvn clean package', label: 'Maven build'
}

def Fake() {
    sh 'echo do nothing but demonstration'
}
