package day1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TasksKtTest{

    @Test
    fun ` test day 1 part 1 `(){
        val input =
            """
                1721
                979
                366
                299
                675
                1456
            """.trimIndent()
        assertEquals(514579, part1(getInputDay1(input)))
    }

    @Test
    fun ` test day 1 part 2 `(){
        val input =
            """
                1721
                979
                366
                299
                675
                1456
            """.trimIndent()
        assertEquals(241861950, part2(getInputDay1(input)))
    }
}