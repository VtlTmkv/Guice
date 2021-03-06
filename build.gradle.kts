plugins {
    java
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
}

allprojects{
    apply {plugin ("java")}
    repositories {
        mavenCentral()
    }

    dependencies{
        implementation("org.jetbrains:annotations:20.1.0")
        implementation ("com.google.inject:guice:5.0.1")
        implementation ("org.jetbrains:annotations:13.0")
    }



}

//plugins {
//    java
//}

group = "org.example"
version = "1.0"

//repositories {
//    mavenCentral()
//}
//
//dependencies {
//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
//    implementation ("com.google.inject:guice:4.0")
//    implementation ("org.jetbrains:annotations:13.0")
//}
//
//tasks.getByName<Test>("test") {
//    useJUnitPlatform()
//}