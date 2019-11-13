FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/graal-java-graphql
WORKDIR /home/app/graal-java-graphql
RUN gu install native-image
RUN native-image --no-server -cp build/libs/graal-java-graphql-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/graal-java-graphql .
ENTRYPOINT ["./graal-java-graphql"]
