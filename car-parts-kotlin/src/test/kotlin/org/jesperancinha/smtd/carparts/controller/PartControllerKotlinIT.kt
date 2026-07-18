package org.jesperancinha.smtd.carparts.controller

import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.nulls.shouldNotBeNull
import org.jesperancinha.smtd.carparts.model.jpa.Part
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.postForEntity

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PartControllerKotlinIT @Autowired constructor(
    private val testRestTemplate: TestRestTemplate
) {
    @Test
    fun testPostNewPartWhenSendingNoTimeoutReturnGoodOk() {
        val engine = Part(name = "Engine")
        val partResponseEntity = testRestTemplate.postForEntity<Part>("/parts", engine)
        partResponseEntity.shouldNotBeNull()
        partResponseEntity.body.shouldBeNull()
    }
}