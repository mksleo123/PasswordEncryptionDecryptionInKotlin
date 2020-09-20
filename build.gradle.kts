import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm") version "1.4.0"
    `maven-publish`
}
group = "me.user"
version = "1.0-SNAPSHOT"
description = "encrypt"

repositories {
    mavenLocal()
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit"))
    implementation ("org.jasypt:jasypt:1.7")
}

val jar by tasks.getting(Jar::class) {
    manifest {
        attributes["Main-Class"] = "com.mycompany.MainKt"
    }
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}
publishing {
    publications {
        val mavenJava by creating(MavenPublication::class) {
            from(components["java"])
        }
    }
}
