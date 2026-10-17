
def call() {
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub-creds',
        usernameVariable: 'DH_USER',
        passwordVariable: 'DH_PASSWORD'
    )]) {
        sh '''
            set +x
            printf 'Username: <%s>\\n' "$DH_USER"
            printf 'Token length: %s\\n' "${#DH_PASSWORD}"
            printf '%s' "$DH_PASSWORD" | docker login \
                --username "$DH_USER" \
                --password-stdin
        '''
    }
}
