package lan.test.graal

import io.micronaut.configuration.graphql.GraphQLRequestBody
import io.micronaut.configuration.graphql.GraphQLResponseBody
import io.micronaut.core.annotation.TypeHint
import io.micronaut.runtime.Micronaut

@TypeHint(
        value = [GraphQLRequestBody::class, GraphQLResponseBody::class],
        accessType = [TypeHint.AccessType.ALL_DECLARED_CONSTRUCTORS, TypeHint.AccessType.ALL_PUBLIC_CONSTRUCTORS, TypeHint.AccessType.ALL_PUBLIC]
)
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("lan.test.graal")
                .mainClass(Application.javaClass)
                .start()
    }
}