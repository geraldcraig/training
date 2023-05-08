plugins {
    id 'groovy'
}

group 'org.example'
version '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.spockframework:spock-core:2.0-groovy-3.0'
    testImplementation 'org.codehaus.groovy:groovy-all:3.0.8'
}

test {
    useJUnitPlatform()
}