package day5

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TasksTest {

    @Test
    fun ` test day 5 part 1  `() {
        assertEquals(820, getInputDay5(testInputDay5).sortedBy { it.seatId }.last().seatId)
    }

    @Test
    fun ` test day 5 part 2  `() {
        assertEquals(597, getMySeatId(getInputDay5(day5Input).sortedBy { it.seatId }))
    }
}

val testInputDay5 = """
BFFFBBFRRR
FFFBBBFRRR
BBFFBBFRLL
""".trimIndent()
