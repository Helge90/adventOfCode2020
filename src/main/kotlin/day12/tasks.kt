package day12

import kotlin.math.absoluteValue


fun main() {
    val input = getInputDay12(day12Input)
    println("day 12 part1 ${day12Part1(input).manhattanDistance()}")
    println("day 12 part2 ${day12Part2(input).ship.manhattanDistance()}")

}

fun day12Part1(input: List<Pair<Char, Int>>): Position =
    input.fold(Position(0, 0, 90)) { acc: Position, pair: Pair<Char, Int> ->
        when (pair.first) {
            'N' -> acc.copy(north = acc.north + pair.second)
            'S' -> acc.copy(north = acc.north - pair.second)
            'E' -> acc.copy(east = acc.east + pair.second)
            'W' -> acc.copy(east = acc.east - pair.second)
            'R' -> acc.copy(heading = (acc.heading + pair.second) % 360)
            'L' -> acc.copy(heading = (acc.heading + (360 - pair.second)) % 360)
            'F' -> when (acc.heading) {
                0 -> acc.copy(north = acc.north + pair.second)
                90 -> acc.copy(east = acc.east + pair.second)
                180 -> acc.copy(north = acc.north - pair.second)
                270 -> acc.copy(east = acc.east - pair.second)
                else -> throw Error("degrees dont line up, ${acc.heading}")
            }
            else -> throw Error("unexpected first")
        }
    }

fun day12Part2(input: List<Pair<Char, Int>>): Positions =
    input.fold(Positions(Position(0, 0, 90), Position(1, 10, 90))) { acc: Positions, pair: Pair<Char, Int> ->
        when (pair.first) {
            'N' -> acc.copy(waypoint = acc.waypoint.copy(north = acc.waypoint.north + pair.second))
            'S' -> acc.copy(waypoint = acc.waypoint.copy(north = acc.waypoint.north - pair.second))
            'E' -> acc.copy(waypoint = acc.waypoint.copy(east = acc.waypoint.east + pair.second))
            'W' -> acc.copy(waypoint = acc.waypoint.copy(east = acc.waypoint.east - pair.second))
            'R' -> when (pair.second) {
                0 -> acc
                90 -> acc.copy(waypoint = acc.waypoint.copy(north = -acc.waypoint.east, east = acc.waypoint.north))
                180 -> acc.copy(waypoint = acc.waypoint.copy(north = -acc.waypoint.north, east = -acc.waypoint.east))
                270 ->acc.copy(waypoint = acc.waypoint.copy(north = acc.waypoint.east, east = -acc.waypoint.north))
                else -> throw Error("unexpected degree")
            }
            'L' -> when (pair.second) {
                0 -> acc
                90 -> acc.copy(waypoint = acc.waypoint.copy(north = acc.waypoint.east, east = -acc.waypoint.north))
                180 -> acc.copy(waypoint = acc.waypoint.copy(north = -acc.waypoint.north, east = -acc.waypoint.east))
                270 ->acc.copy(waypoint = acc.waypoint.copy(north = -acc.waypoint.east, east = acc.waypoint.north))
                else -> throw Error("unexpected degree")
            }

            'F' -> acc.copy(
                ship = acc.ship.copy(
                    north = acc.ship.north + acc.waypoint.north * pair.second,
                    east = acc.ship.east + acc.waypoint.east * pair.second
                )
            )
            else -> throw Error("unexpected first")
        }
    }

fun getInputDay12(input: String): List<Pair<Char, Int>> = input.lines().map { Pair(it.first(), it.drop(1).toInt()) }

data class Position(val north: Int, val east: Int, val heading: Int) {
    fun manhattanDistance() = north.absoluteValue + east.absoluteValue
}

data class Positions(val ship: Position, val waypoint: Position)

val inputExample = """
F10
N3
F7
R90
F11
""".trimIndent()