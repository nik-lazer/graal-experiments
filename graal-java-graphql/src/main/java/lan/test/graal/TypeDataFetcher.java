package lan.test.graal;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

import javax.inject.Singleton;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Singleton
public class TypeDataFetcher implements DataFetcher<List<Type>> {
    public List<Type> get(DataFetchingEnvironment environment) {
        return Collections.singletonList(Type.DEFAULT_TYPE);
    }

}
