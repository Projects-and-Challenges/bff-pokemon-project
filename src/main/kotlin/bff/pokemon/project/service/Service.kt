package bff.pokemon.project.service

import bff.pokemon.project.client.Client
import org.springframework.stereotype.Service

@Service
class Service(private val client: Client) {
    fun index(): String {
        return client.index()
    }
}