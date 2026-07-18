package org.jesperancinha.smtd.furniture.client

import org.jesperancinha.smtd.furniture.model.Chair
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject


@Service
class ExternalClient(
    private val restTemplate: RestTemplate
) {

    fun externalChairs(): List<Chair> =
        restTemplate.getForObject<Array<Chair>>("http://localhost:9001").toList()
}