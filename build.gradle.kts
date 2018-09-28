import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.neopragma"
version = "0.1-SNAPSHOT"

plugins {
    application
    kotlin("jvm") version "1.2.61"
}

application {
    mainClassName = "org.example.calculator.CalculatorKt"
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile(kotlin("test"))
    testCompile("io.kotlintest:kotlintest-runner-junit5:3.1.8")
    // these entries support JUnit5 tests
    testCompile("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testCompile("org.junit.jupiter:junit-jupiter-params:5.3.1")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.3.1")
}

repositories {
    jcenter()
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}
