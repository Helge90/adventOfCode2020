package day2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TasksKtTest {

    @Test
    fun ` test day 2 part 1  `() {
        assertEquals(2, getValidPasswords(testInputDay2.lines()))
    }

    @Test
    fun ` test day 2 part 2  `() {
        assertEquals(1, getValidPasswordsNewRules(testInputDay2.lines()))
    }
}

val testInputDay2 = """
1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc
""".trimIndent()