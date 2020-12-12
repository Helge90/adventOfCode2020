package day10


fun main() {
    val backpack = getInputDay10(day10Input)
    println("day 10 part1 ${day10part1(backpack)}")
     println("day 10 part2 ${day10part2(backpack)}")
}

//Shamelessly stolen from another nav employee
//but i think i understand it
fun day10part2(backPack: List<Int>): Long {
    val pathsFrom = mutableMapOf(Pair((backPack.maxOrNull()!! + 3).toLong(), 1.toLong()))
    backPack.map { it.toLong() }.sorted().reversed()
        .forEach { pathsFrom[it] = (pathsFrom[it + 1] ?: 0) + (pathsFrom[it + 2] ?: 0) + (pathsFrom[it + 3] ?: 0) }
    return (pathsFrom[1] ?: 0) + (pathsFrom[2] ?: 0) + (pathsFrom[3] ?: 0)
}

fun day10part1(backpack: List<Int>): Int {
    val fromFlightToAdapter = backpack + 0 + (backpack.maxOrNull()!! + 3)
    var diff3 = 0
    var diff2 = 0
    var diff1 = 0
    fromFlightToAdapter.sorted().reduce { first, second ->
        when (second - first) {
            1 -> diff1++
            2 -> diff2++
            3 -> diff3++
            else -> throw Exception("unexpected diff $first, $second")
        }
        second
    }
    return diff3 * diff1
}

fun getInputDay10(input: String) = input.lines().map { it.toInt() }

val inputExample = """
16
10
15
5
1
11
7
19
6
12
4
""".trimIndent()

val ex2 = """
28
33
18
42
31
14
46
20
48
47
24
23
49
45
19
38
39
11
1
32
25
35
8
17
7
9
4
2
34
10
3
""".trimIndent()