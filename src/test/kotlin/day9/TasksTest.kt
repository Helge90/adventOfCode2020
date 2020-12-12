package day9

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksTest {

    @Test
    fun ` test day 9 part 1  `() {
        assertEquals(127, validateNumbers(getInputDay9(testInputDay9), 5))
    }

    @Test
    fun ` test day 9 part 2  `() {
        val invalidNumber = validateNumbers(getInputDay9(testInputDay9), 5)
        assertEquals(62, findContiguousListForLong(getInputDay9(testInputDay9), invalidNumber))
    }
}

val testInputDay9 = """
35
20
15
25
47
40
62
55
65
95
102
117
150
182
127
219
299
277
309
576
""".trimIndent()
