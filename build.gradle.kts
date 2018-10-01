import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.neopragma"
version = "0.1-SNAPSHOT"
val spek_version="2.0.0-alpha.1"

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
    // these entries support Spek 2.9
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spek_version")
    testImplementation("org.spekframework.spek2:spek-runner-junit5:$spek_version")
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/spekframework/spek-dev")
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}
