# logbackDemo

This project is to demonstrate that Logback can be set up with a more XML style Spring project setup. To start it up, run
```
mvn clean install tomcat7:run -Dmaven.tomcat.port=9000
```

## To build the project from Concourse

### Use the Vagrantfile in the root of this project to spin up Concourse:
```
$ vagrant init concourse/lite
$ vagrant up
$ fly -t lite login -c http://192.168.100.4:8080
```

### Set up a directory for the project and send the pipeline configuration to your running Concourse instance:
```
$ cd ~/workspace
$ git clone https://github.com/adelamodwala/logbackDemo.git
$ cd logbackDemo
$ fly -t lite set-pipeline -p logbackDemo -c concourse/pipeline.yml
$ fly -t lite unpause-pipeline -p logbackDemo
```
