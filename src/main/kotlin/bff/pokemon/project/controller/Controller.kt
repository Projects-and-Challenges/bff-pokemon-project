package bff.pokemon.project.controller

import bff.pokemon.project.service.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class Controller (private val service: Service) {
    @GetMapping
    fun index() : String {
        return service.index()
    }
}