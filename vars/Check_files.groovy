def call()
{
  sh """
  echo "Checking Application files"
  test -f frontend/Dockerfile
  test -f backend/Dockerfile
  echo "Both Dockerfiles found"
  
  """
}
