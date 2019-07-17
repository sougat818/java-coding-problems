Java Coding Problems 

# Dev Setup - Mac

* Install
  * Intellij Idea
	  * Enable command line from toolbox
  * JDK 8 
  * GitIgnoreGenerator - https://www.gitignore.io/
    ```sh
    git config --global alias.ignore \
    '!gi() { curl -sL https://www.gitignore.io/api/$@ ;}; gi'
    ```
  

# Project Generation Steps

```sh
mvn archetype:generate  -DgroupId=com.sougat818 -DartifactId=java-coding-problems -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
cd java-coding-problems/
idea pom.xml
git init
git remote add origin https://github.com/sougat818/java-coding-problems.git
git config user.email
```

### Gitignore

```sh
gi maven,java,eclipse,intellij+all > .gitignore
```

### Maven Wrapper
TBC

### Intellij Templates

* Files are already placed at .idea/fileTemplates
* Open Preferences --> Editor --> File & Code Templates 
* Switch to Project and hit apply
* Problem${PROBLEM_NUMBER} templates are now available at new File Menu Options

### Circle CI
```.circleci/config.yml```

### Travis CI 
```.travis.yml```

### Code Style

```codeStyles/codeStyleConfig.xml```<br/>
```pom.xml - maven-checkstyle-plugin```

### Maven Wrapper
```mvn -N io.takari:maven:0.7.6:wrapper```

### Maven Enforcer
```maven-enforcer-plugin```
```java version```
```maven version```

### Maven Unit Test reports
```maven-surefire-report-plugin```

### Dependecy Version Management
```versions-maven-plugin```

### Code Coverage

```jacoco-maven-plugin```
```circle CI & Travis integration to codecov.io```