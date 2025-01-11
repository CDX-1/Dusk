plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.12"
    id("io.github.goooler.shadow") version "8.1.8"
}

group = "lol.cdx"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://repo.codemc.io/repository/maven-releases/")
    maven("https://repo.codemc.io/repository/maven-snapshots/")
}

dependencies {
    paperweight.paperDevBundle("1.21.3-R0.1-SNAPSHOT")
    implementation("com.github.retrooper:packetevents-spigot:2.7.0")
}

tasks {
    shadowJar {
        relocate("com.github.retrooper.packetevents", "lol.cdx.dusk.packetevents.api")
        relocate("io.github.retrooper.packetevents", "lol.cdx.dusk.packetevents.impl")
    }
}