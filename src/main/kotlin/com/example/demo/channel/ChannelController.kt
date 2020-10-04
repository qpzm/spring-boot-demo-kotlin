package com.example.demo.channel

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Controller
class ChannelController(
    private val channelService: ChannelService
) {
    @GetMapping("/channels")
    fun index(): ResponseEntity<List<Channel>> {
        val channels = channelService.findAll()
        return ResponseEntity.ok(channels)
    }

    @PostMapping("/channels")
    fun create(
        // @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization
        // https://www.baeldung.com/spring-request-response-body
        @RequestBody channelCreateDto: ChannelCreateDto
    ): ResponseEntity<Channel> {
        val channel = channelService.create(channelCreateDto.description)
        return ResponseEntity.ok(channel)
    }

    @PostMapping("/debug")
    fun debug(
        @RequestBody body: String
    ): ResponseEntity<Any> {
        return ResponseEntity.ok(body)
    }
}