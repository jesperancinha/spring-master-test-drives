package org.jesperancinha.smtd.furniture.dto

data class ChairDto(
    val id: Long,
    val designation: String?,
    val weight: Long?
) {
    constructor() : this(0L, null, null)
}