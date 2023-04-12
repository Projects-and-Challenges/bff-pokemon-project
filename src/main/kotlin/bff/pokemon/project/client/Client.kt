package bff.pokemon.project.client

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "Backend", url = "https://localhost:8080")
interface Client {
    @RequestMapping(method = [RequestMethod.GET], path = ["/hello"])
    fun index() : String
}