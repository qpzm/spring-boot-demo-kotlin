package com.example.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest
class DemoApplicationTests() {

    @Test
    fun contextLoads() {
        val restTemplate = TestRestTemplate()
        val entity = restTemplate.getForEntity<String>("http://localhost:8080?name=Test")
        assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        assertThat(entity.body).isEqualTo("Test")
    }

}
