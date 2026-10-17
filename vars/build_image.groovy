def call(String username, String tag, String projectname, String path)
{
  sh """
    docker build -t ${username}/${projectname}:${tag} ${path}
  """
}
