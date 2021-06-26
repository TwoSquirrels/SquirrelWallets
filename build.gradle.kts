// Set gradle options

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.yaml:snakeyaml:1.17")
        classpath("org.json:json:20210307")
    }
}

plugins {
    id("java")
}

import org.json.JSONObject
import org.yaml.snakeyaml.Yaml

// Import project.yml with SnakeYaml

Yaml yaml = new Yaml()
JSONObject projectInfo = new JSONObject((Map<String, Object>) yaml.load(
        new FileInputStream(new File("$projectDir/project.yml"))
))

// Set compile options

repositories {
    mavenLocal()
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven(url = "https://oss.sonatype.org/content/groups/public/")
    maven(url = "https://repo.maven.apache.org/maven2/")
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
}

group = projectInfo.getString("group")
version = projectInfo.getString("version")
description = projectInfo.getString("description")

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType(JavaCompile) {
    options.encoding = "UTF-8"
}

// TODO: Embed the license notation at the top of the file

// Scan all files
new File("$projectDir/src/main/java").eachFileRecurse { file ->
    if (!file.isFile()) return
    println(">>> " + file.getName())

}

// TODO: Replace plugin.yml
