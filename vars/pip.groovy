def call() {
    pipeline {
        agent any

        stages {
            stage('Demo') {
                steps {
                    echo "hello, I'm from a shared-library"
                }
            }
        }
    }
}
