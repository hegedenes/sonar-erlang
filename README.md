![Build](https://github.com/evolution-gaming/sonar-erlang/workflows/Build/badge.svg?branch=master)

# About

SonarQube server Erlang language plugin.

## Description / Features
The plugin enables analysis of Erlang within SonarQube.

## Usage

### Run an Analysis with the SonarQube Scanner (recommended method)
To run an analysis of your Erlang project, use the SonarQube Scanner.
A sample project is available on GitHub: https://github.com/SonarSource/sonar-scanning-examples/tree/master/sonarqube-scanner
### Run an Analysis with other Analyzers
Maven and Ant can also be used to launch analysis on Erlang projects.

## Development

The project uses Maven and JDK version 8 and above.

### Build

Build the release plugin JAR with Maven

```shell script
mvn package
```

You will find the built JAR in `sonar-erlang-plugin/target/sonar-erlang-plugin.jar`

### Test

Run all tests with

```shell script
mvn test
```
