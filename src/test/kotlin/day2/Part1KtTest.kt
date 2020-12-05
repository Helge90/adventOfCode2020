package day2

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TasksKtTest{

    @Test
     fun ` test day 2 part 1  `(){
        val input =
            """
                1-3 a: abcde
                1-3 b: cdefg
                2-9 c: ccccccccc
            """.trimIndent()
        assertEquals(2, getValidPasswords(input.lines()))
    }

    @Test
     fun ` test day 2 part 2  `(){
        val input =
            """
                1-3 a: abcde
                1-3 b: cdefg
                2-9 c: ccccccccc
            """.trimIndent()
        assertEquals(1, getValidPasswordsNewRules(input.lines()))
    }
}