package day3

fun main() {
    val trip = getInputDay3(day3Input)
    println("day3 part1 = ${findTrees(trip)}")
    val bigNumber: Long = findSolutionPart2(trip, listOf(Pair(1,1),Pair(3,1),Pair(5,1),Pair(7,1),Pair(1,2)))
    println("day3 part2 = $bigNumber")

}

fun findSolutionPart2(trip: Array<BooleanArray>, pairs: List<Pair<Int,Int>>) =
    findTreesPartTwo(trip, pairs[0].first, pairs[0].second).toLong() *
        findTreesPartTwo(trip, pairs[1].first, pairs[1].second).toLong() *
        findTreesPartTwo(trip, pairs[2].first, pairs[2].second).toLong() *
        findTreesPartTwo(trip, pairs[3].first, pairs[3].second).toLong() *
        findTreesPartTwoWithSkip(trip, pairs[4].first).toLong()

fun getInputDay3(input: String): Array<BooleanArray> {
    val lines = input.lines()
    return Array(lines.size) { outer ->
        BooleanArray(lines[0].length) { inner ->
            lines[outer][inner] == '#'
        }
    }
}

fun findTrees(trip: Array<BooleanArray>): Int {
    var movesToTheRight = 0
    return trip.foldIndexed(0) { index, acc, path ->
        if (index != 0) movesToTheRight += 3
        when {
            index == 0 -> 0
            path[movesToTheRight % path.size] -> acc + 1
            else -> acc
        }
    }

}

fun findTreesPartTwo(trip: Array<BooleanArray>, movesToTheRight: Int, jumpsDown: Int?): Int {
    var movesToTheRightSum = 0
    return trip.foldIndexed(0) { index, acc, path ->
        if (index != 0) movesToTheRightSum += movesToTheRight
        when {
            index == 0 -> 0
            path[movesToTheRightSum % path.size] -> acc + 1
            else -> acc
        }
    }
}

fun findTreesPartTwoWithSkip(trip: Array<BooleanArray>, movesToTheRight: Int): Int {
    var movesToTheRightSum = 0
    return trip.foldIndexed(0) { index, acc, path ->
        if (index != 0 && index % 2 != 0) movesToTheRightSum += movesToTheRight
        when {
            index == 0 -> 0
            index % 2 != 0 -> acc
            path[movesToTheRightSum % path.size] -> acc + 1
            else -> acc
        }
    }
}


class TerrainAndPath(
    private val terrain: Array<CharArray>,
    private val dx: Int,
    private val dy: Int
) {
    private val width = terrain[0].size
    private val length = terrain.size

    fun countTreesOnPath(treeCount: Long = 0, x: Int = 0, y: Int = 0): Long =
        if (y < length) countTreesOnPath(
            treeCount = if (terrain[y][x] == '#') treeCount + 1 else treeCount,
            x = if (x < width - dx) x + dx else dx - width + x,
            y = y + dy
        ) else treeCount
}

val inputExample = """
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