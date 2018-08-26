plugins {
    kotlin("jvm")
    id("jps-compatible")
}

description = "Kotlin/Native deserializer and library reader"

jvmTarget = "1.6"

dependencies {

    // Compile-only dependencies are needed for compilation of this module:
    compileOnly(project(":compiler:frontend"))
    compileOnly(project(":compiler:frontend.java"))

    // This dependency is necessary to keep the right dependency record inside of POM file:
    compile(projectRuntimeJar(":kotlin-compiler"))

    compile(project(":konan:konan-utils"))
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

standardPublicJars()

publish()