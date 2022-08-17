def down(repo)
{
 git "${repo}"
}

def build()
{
 sh 'mvn package'
}
