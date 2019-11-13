package lan.test.graal

import io.micronaut.core.annotation.Introspected

@Introspected
data class Type(val type: String, val names: List<String>) {

    companion object {
        val DEFAULT_TYPE: Type = Type("HELLO", listOf("Graal", "Kotlin", "GraphQL"))
    }
}
