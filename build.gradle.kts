plugins {
    id("java")
    id("maven-publish")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

//afterEvaluate {
//    publishing {
//        publications {
//            release(MavenPublication) {
//                from components.release
//
//                        groupId = 'com.github.m7devoo'
//                artifactId = 'material-compose'
//                version = '1.0'
//            }
//        }
//    }
//}

sourceSets {
    main {
        java.srcDirs("src/main/java")
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["java"])
                groupId = "com.github.THE-M7D-99"
                artifactId = "test"
                version = "1.0"
            }
        }
    }
}
