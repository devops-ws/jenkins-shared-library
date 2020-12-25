def call() {
    pipeline {
        agent any

        stages {
            stage('Demo') {
                steps {
                    println "hello, I'm from a shared-library"
                }
            }
        }
    }
}
