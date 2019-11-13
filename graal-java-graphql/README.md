<h2>Creating of the project</h2>
`mn create-app lan.test.graal.graal-java-graphql --lang=java --features spock,graal-native-image`

<h2>Build Jar</h2>
`gradlew assemble`

<h2>Create a Docker build</h2>
`docker build . -t graal-java-graphql`

<h2>Run docker container</h2>
`docker run -p 8082:8080 -t graal-java-graphql`
 