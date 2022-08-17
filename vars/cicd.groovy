def down(repo)
{
 git "${repo}"
}



def build()
{
 sh 'mvn package'
}


def deploy(jobname, ip, appname)
{
 sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@{ip}:/var/lib/tomcat9/webapp/${appname}"
}
