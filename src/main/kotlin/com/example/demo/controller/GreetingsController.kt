package com.example.demo.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GreetingsController {
    @GetMapping("/")
    fun greeting(
            @RequestParam(value = "name", name = "name", required = false, defaultValue = "World")
            name: String
    ): ResponseEntity<String> {
        return ResponseEntity.ok(name)
    }
}