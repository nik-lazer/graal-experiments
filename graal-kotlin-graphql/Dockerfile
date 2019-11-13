FROM oracle/graalvm-ce:19.2.0.1 as graalvm
COPY . /home/app/graal-kotlin-graphql
WORKDIR /home/app/graal-kotlin-graphql
RUN gu install native-image
RUN native-image --no-server -cp build/libs/graal-kotlin-graphql-*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/graal-kotlin-graphql .
ENTRYPOINT ["./graal-kotlin-graphql"]
