package lan.test.graal

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/hello")
class HelloController {
    @Get(produces = [MediaTyspe.TEXT_JSON])
    fun index(): Type {
        return Type.DEFAULT_TYPE
    }
}