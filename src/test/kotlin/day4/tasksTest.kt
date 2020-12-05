package day4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class tasksTest {

    @Test
    fun ` test day 4 part 1  `() {
        assertEquals(2, getSolutionDay4Part1(getInputDay4(testInputDay4)))
    }

    @Test
    fun ` test day 4 part 2  `() {
        assertEquals(2, getSolutionDay4Part2(getInputDay4(testInputDay4)))
    }
}

val testInputDay4 = """
                        ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
                        byr:1937 iyr:2017 cid:147 hgt:183cm
                        
                        iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884
                        hcl:#cfa07d byr:1929
                        
                        hcl:#ae17e1 iyr:2013
                        eyr:2024
                        ecl:brn pid:760753108 byr:1931
                        hgt:179cm
                        
                        hcl:#cfa07d eyr:2025 pid:166559648
                        iyr:2011 ecl:brn hgt:59in
                    """.trimIndent()
