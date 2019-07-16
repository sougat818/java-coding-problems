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

