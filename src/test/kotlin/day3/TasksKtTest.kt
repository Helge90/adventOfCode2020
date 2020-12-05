package day3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TasksKtTest{

    @Test
    fun ` test day 3 part 1  `(){
        assertEquals(7, findTrees(getInputDay3(testInputDay3)))
    }

    @Test
    fun ` test day 3 part 2  `(){
        assertEquals(336, findSolutionPart2(getInputDay3(testInputDay3), listOf(Pair(1,1),Pair(3,1),Pair(5,1),Pair(7,1),Pair(1,2))))
    }
}

val testInputDay3 =
            """
                ..##.........##.........##.........##.........##.........##.......
                #...#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..
                .#....#..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.
                ..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#
                .#...##..#..#...##..#..#...##..#..#...##..#..#...##..#..#...##..#.
                ..#.##.......#.##.......#.##.......#.##.......#.##.......#.##.....
                .#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#
                .#........#.#........#.#........#.#........#.#........#.#........#
                #.##...#...#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...
                #...##....##...##....##...##....##...##....##...##....##...##....#
                .#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#
            """.trimIndent()