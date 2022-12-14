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
 sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}"
}


def test(jobname)
{
 sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}

def mail(body, subject, email)
{
 mail bcc: '', body: "${body}", cc: '', from: '', replyTo: '', subject: "${subject}", to: "${email}"
}
