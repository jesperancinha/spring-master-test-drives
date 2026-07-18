package org.jesperancinha.smtd.furniture.model

import jakarta.persistence.*

@Entity
@Table(name = "chair")
data class Chair(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val designation: String?,
    val weight: Long?
) {
    constructor() : this(0L, null, null)
}