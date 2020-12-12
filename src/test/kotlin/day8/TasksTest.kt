package day8

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksTest {

    @Test
    fun ` test day 8 part 1  `() {
        assertEquals(5, runProgram(getInputDay8(testInputDay8), 0, 0))
    }

    @Test
    fun ` test day 8 part 2  `() {
        assertEquals(8, findFixedProgram(getInputDay8(testInputDay8)))
    }
}

val testInputDay8 = """
nop +0
acc +1
jmp +4
acc +3
jmp -3
acc -99
acc +1
jmp -4
acc +6
""".trimIndent()
