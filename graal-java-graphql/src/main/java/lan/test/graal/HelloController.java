package lan.test.graal;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get(produces = {MediaType.TEXT_JSON})
    public Type index() {
        return Type.DEFAULT_TYPE;
    }
}
