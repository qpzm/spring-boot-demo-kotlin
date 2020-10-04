package com.example.demo.channel

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ChannelRepository: JpaRepository<Channel, Long>