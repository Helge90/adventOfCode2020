package day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksKtTest {

    @Test
    fun ` test day 1 part 1 `() {
        assertEquals(514579, part1(getInputDay1(testInputDay1)))
    }

    @Test
    fun ` test day 1 part 2 `() {
        assertEquals(241861950, part2(getInputDay1(testInputDay1)))
    }
}

val testInputDay1 = """
1721
979
366
299
675
1456
""".trimIndent()