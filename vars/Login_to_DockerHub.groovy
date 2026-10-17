
def call() {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-creds',
        usernameVariable: 'DH_USER',
        passwordVariable: 'DH_PASSWORD'
    )]) {
        sh '''
            set +x
            printf '%s' "$DH_PASSWORD" | docker login \
                --username "$DH_USER" \
                --password-stdin
        '''
    }
}
