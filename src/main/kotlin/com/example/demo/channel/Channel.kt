package com.example.demo.channel

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.jpa.repository.Temporal
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "channel") // class 이름과 같으면 생략 가능
data class Channel(
    @Id
    @GeneratedValue
    @Column(name = "id")
    val id: Long = -1,

    @Column(name = "description")
    val description: String,

    @Temporal
    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: Date = Date(),

    @Temporal
    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: Date = Date()
)