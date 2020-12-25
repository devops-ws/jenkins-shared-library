def call() {
    pipeline {
        agent any

        stages {
            stage('Demo') {
                    println "hello, I'm from a shared-library"
                }
            }
        }
    }
}
