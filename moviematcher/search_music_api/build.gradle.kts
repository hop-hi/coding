plugins {
	java
	id("org.springframework.boot") version "2.7.11"
	id("io.spring.dependency-management") version "1.1.0"
}

group = "com.mh.music"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jdbc
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc:2.7.15")

	// https://mvnrepository.com/artifact/com.google.code.gson/gson
	implementation("com.google.code.gson:gson:2.10.1")

	// postgres
	implementation("org.postgresql:postgresql:42.6.0")

	// mybatis
	implementation("org.mybatis:mybatis:3.5.13")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}
//
//tasks.withType<Test> {
//	useJUnitPlatform()
//}
