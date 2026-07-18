package org.jesperancinha.smtd.furniture.service

import io.kotest.matchers.nulls.shouldNotBeNull
import org.jesperancinha.smtd.furniture.model.Case
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.Execution
import org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@Execution(SAME_THREAD)
internal open class CaseServiceITTest @Autowired constructor(
    private val caseService: CaseService
) {

    @Test
    open fun `should insert a case and read it back from the database`(){
        val case = Case(
            id = null,
            designation = "Weaved Chair",
            weight = 4000L
        )
        val insertedCase = caseService.insertCase(case)

        insertedCase.id.shouldNotBeNull()
    }
}