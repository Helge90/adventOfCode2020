package day6

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TasksTest{

    @Test
    fun ` test day 6 part 1  `() {
        assertEquals(11, countnumberOfYesAnswers(getInputDay6(testInputDay6)))
    }

    @Test
    fun ` test day 6 part 2  `() {
        assertEquals(6, countnumberOfYesFromAllInGroup(getInputDay6(testInputDay6)))
    }
}

val testInputDay6 = """
                    abc
                    
                    a
                    b
                    c
                    
                    ab
                    ac
                    
                    a
                    a
                    a
                    a
                    
                    b
                    """.trimIndent()
