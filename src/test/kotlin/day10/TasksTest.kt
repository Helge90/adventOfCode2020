package day10

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksTest {

    @Test
    fun ` test day 10 part 1  `() {
        assertEquals(35, day10part1(getInputDay10(testInputDay10)))
    }

    @Test
    fun ` test day 10 part 2  `() {
        assertEquals(8, day10part2(getInputDay10(testInputDay10)))
    }
}

val testInputDay10 = """
16
10
15
5
1
11
7
19
6
12
4
""".trimIndent()
