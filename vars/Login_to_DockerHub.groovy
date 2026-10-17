def call()
{
withCredentials([
  usernamePassword(
    credentialsId: 'dockerhub-creds',
    usernameVariable: 'DH_USER',
    passwordVariable: 'DH_PASSWORD'
)
  ])
  {
    sh """
    docker login -u \${DH_USER} -p \${DH_PASSWORD}
    """
  }
}
