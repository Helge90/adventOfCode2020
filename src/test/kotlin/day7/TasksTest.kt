package day7

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TasksTest{

    @Test
    fun ` test day 7 part 1  `() {
        assertEquals(5,2)
    }

    @Test
    fun ` test day 7 part 2  `() {
        assertEquals(8, 2)
    }
}

val testInputDay8 = """
light red bags contain 1 bright white bag, 2 muted yellow bags.
dark orange bags contain 3 bright white bags, 4 muted yellow bags.
bright white bags contain 1 shiny gold bag.
muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.
shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.
dark olive bags contain 3 faded blue bags, 4 dotted black bags.
vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.
faded blue bags contain no other bags.
dotted black bags contain no other bags.
""".trimIndent()
