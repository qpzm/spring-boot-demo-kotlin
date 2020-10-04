package com.example.demo.channel

import com.example.demo.helper.JsonHelper
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@AutoConfigureMockMvc
internal class ChannelControllerTest(
    @Autowired val mockMvc: MockMvc,
    @Autowired val jsonHelper: JsonHelper
) {

    @Test
    fun index() {
        mockMvc.perform(MockMvcRequestBuilders.get("/channels")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }

    @Test
    fun create() {
        val body = mapOf("description" to "Test desc")

        mockMvc.perform(MockMvcRequestBuilders.post("/channels")
            .contentType(MediaType.APPLICATION_JSON)
            .content(jsonHelper.serialize(body)))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }
}