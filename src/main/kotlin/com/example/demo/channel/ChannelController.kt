package com.example.demo.channel

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ChannelController(
    private val channelService: ChannelService
) {
    @GetMapping("/channels")
    fun greeting(): ResponseEntity<List<Channel>> {
        val channels = channelService.findAll()
        return ResponseEntity.ok(channels)
    }
}