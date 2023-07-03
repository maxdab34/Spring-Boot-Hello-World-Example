package com.reytech.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

@Test
void contextLoads() {
}
@Test
void groupAssertions(){
Personne pers = new Personne("owl","OWL");
assertAll("peronne",()-> assertEquals("owl", pers.getFirstName()),
() -> assertEquals("OWL",pers.getLastName()));
}
}
