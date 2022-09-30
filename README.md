# Micronaut picocli command line app for jokes REST API

CLI tool to expose https://jokes.guyliangilsing.me/api.html via *NIX command line interface. This implementation uses picocli,
Micronaut and GraalVM native image targeting JDK 17.

## How to build and enjoy the native executable image

- Install Graal VM JDK 17. The easiest way to install GraalVM on Linux or Mac is to use [sdkman](https://sdkman.io/)
  - `sdk install java 22.1.0.r17-grl
- Install native-image tool
  - `gu install native-image`
- To compile native image into a binary executable
  - `./gradlew clean nativeCompile` The executable will be built as `build/native/nativeCompile/joke`
  Feel free to move this binary into one of the configured system `$PATH`s and enjoy random `Dad` or `Yo momma` joke. Also, use at your own risk




