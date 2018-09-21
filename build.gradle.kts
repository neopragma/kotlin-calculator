import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "org.example"
version = "0.1-SNAPSHOT"

buildscript {
 @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
 var kotlinVer: String by extra
 @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
 var kotlinTestVer: String by extra
 
 @Suppress("UNUSED_VALUE")
 kotlinVer = "1.2.61"
 @Suppress("UNUSED_VALUE")
 kotlinTestVer = "2.0.7"
}
val kotlinVer: String by extra
val kotlinTestVer: String by extra

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
}

repositories {
    jcenter()
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
    }
}

val compileKotlin by tasks.getting(KotlinCompile::class) {
 // Customise the "compileKotlin" task.
 kotlinOptions.jvmTarget = "1.8"
 doLast { println("Finished compiling Kotlin source code") }
}
val compileTestKotlin by tasks.getting(KotlinCompile::class) {
 // Customise the "compileTestKotlin" task.
 kotlinOptions.jvmTarget = "1.8"
 doLast { println("Finished compiling Kotlin source code for testing") }
}

