package lan.test.graal

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("lan.test.graal")
                .mainClass(Application.javaClass)
                .start()
    }
}