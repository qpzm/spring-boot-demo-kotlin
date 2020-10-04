package com.example.demo.channel

import org.springframework.stereotype.Service

@Service
class ChannelService(
    private val channelRepository: ChannelRepository
) {
    fun findAll(): List<Channel> {
        return channelRepository.findAll()
    }

    fun create(description: String): Channel {
        val post = Channel(
            description = description
        )
        return channelRepository.save(post)
    }
}
