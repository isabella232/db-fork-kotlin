// !WITH_NEW_INFERENCE
// FULL_JDK

import java.util.stream.Collectors
import java.util.stream.IntStream

fun main() {
    val xs = IntStream.<!INTERFACE_STATIC_METHOD_CALL_FROM_JAVA6_TARGET_ERROR!>range<!>(0, 10).mapToObj { it.toString() }
            .<!NI;NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>collect<!>(Collectors.toList())
    xs[0]
}