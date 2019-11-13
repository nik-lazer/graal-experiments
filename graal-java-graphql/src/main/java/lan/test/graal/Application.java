package lan.test.graal;

import graphql.schema.PropertyDataFetcher;
import io.micronaut.configuration.graphql.GraphQLRequestBody;
import io.micronaut.configuration.graphql.GraphQLResponseBody;
import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(
        value = {GraphQLRequestBody.class, GraphQLResponseBody.class, PropertyDataFetcher.class},
        accessType = {TypeHint.AccessType.ALL_DECLARED_CONSTRUCTORS, TypeHint.AccessType.ALL_PUBLIC_CONSTRUCTORS, TypeHint.AccessType.ALL_PUBLIC}
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}