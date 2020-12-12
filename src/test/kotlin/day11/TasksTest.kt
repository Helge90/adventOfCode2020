package day11

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TasksTest{

    @Test
    fun ` test day 11 part 1  `() {
        assertEquals(37,day11Part1(getInputDay11(testInputDay11)))
    }

    @Test
    fun ` test day 11 part 2  `() {
        assertEquals(26, day11Part2(getInputDay11(testInputDay11)))
    }
}

val testInputDay11 = """
L.LL.LL.LL
LLLLLLL.LL
L.L.L..L..
LLLL.LL.LL
L.LL.LL.LL
L.LLLLL.LL
..L.L.....
LLLLLLLLLL
L.LLLLLL.L
L.LLLLL.LL
""".trimIndent()
