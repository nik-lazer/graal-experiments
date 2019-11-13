package lan.test.graal

import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import lan.test.graal.Type
import javax.inject.Singleton

@Singleton
class TypeDataFetcher: DataFetcher<List<Type>> {
    override fun get(environment: DataFetchingEnvironment?): List<Type> {
        return listOf(Type.DEFAULT_TYPE)
    }

}
