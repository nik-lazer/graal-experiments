package lan.test.graal;

import io.micronaut.core.annotation.Introspected;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Introspected
public class Type {
    String type;
    List<String> names;

    public Type(String type, List<String> names) {
        this.type = type;
        this.names = names;
    }

    public Type() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type1 = (Type) o;
        return type.equals(type1.type) &&
                names.equals(type1.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, names);
    }

    public static final Type DEFAULT_TYPE = new Type("HELLO", Arrays.asList("Graal", "Java", "GraphQL"));
}
