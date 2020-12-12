package day12

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksTest {

    @Test
    fun ` test day 12 part 1  `() {
        assertEquals(25, day12Part1(getInputDay12(testInputDay12)).manhattanDistance())
    }

    @Test
    fun ` test day 12 part 2  `() {
        assertEquals(286, day12Part2(getInputDay12(testInputDay12)).ship.manhattanDistance())
    }
}

val testInputDay12 = """
F10
N3
F7
R90
F11
""".trimIndent()
