plugins {
    java
}

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public")}
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}