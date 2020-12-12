package day11


fun main() {
    println("day 11 part1 ${day11Part1(getInputDay11(day11Input))}")
    println("day 11 part2 ${day11Part2(getInputDay11(day11Input))}")
}

fun day11Part1(input: Array<CharArray>): Int {
    var seating = input
    do {
        seating = applyRules(seating)
    } while (applyRules(seating) !== seating)
    return seating.fold(0) { acc, chars ->
        acc + chars.count { it == '#' }
    }
}

fun day11Part2(input: Array<CharArray>): Int {
    var seating = input
    do {
        seating = applyRulesPart2(seating)
    } while (applyRulesPart2(seating) !== seating)
    return seating.fold(0) { acc, chars ->
        acc + chars.count { it == '#' }
    }
}

fun applyRules(input: Array<CharArray>): Array<CharArray> {
    val newSeating = Array(input.size) { horizontal ->
        CharArray(input[0].size) { vertical ->
            input[horizontal][vertical]
        }
    }
    var changedState = false
    input.forEachIndexed { y, vertical ->
        vertical.forEachIndexed { x, spot ->
            if (spot == 'L' && noAdjacentOccupations(input, y, x)) {
                newSeating[y][x] = '#'
                changedState = true
            } else if (spot == '#' && fourOrMoreAdjacentOccupations(input, y, x)) {
                newSeating[y][x] = 'L'
                changedState = true
            }
        }
    }
    return if (changedState) newSeating else input

}

fun applyRulesPart2(input: Array<CharArray>): Array<CharArray> {
    val newSeating = Array(input.size) { horizontal ->
        CharArray(input[0].size) { vertical ->
            input[horizontal][vertical]
        }
    }
    var changedState = false
    input.forEachIndexed { y, vertical ->
        vertical.forEachIndexed { x, spot ->
            if (spot == 'L' && noAdjacentOccupationsInSight(input, y, x)) {
                newSeating[y][x] = '#'
                changedState = true
            } else if (spot == '#' && fiveOrMoreAdjacentOccupationsInSight(input, y, x)) {
                newSeating[y][x] = 'L'
                changedState = true
            }
        }
    }
    return if (changedState) newSeating else input

}

fun noAdjacentOccupations(input: Array<CharArray>, x: Int, y: Int): Boolean {
    //If a seat is empty (L) and there are no occupied seats adjacent to it, the seat becomes occupied.
    if (checkOccupation(input, x, y + 1)) return false
    if (checkOccupation(input, x, y - 1)) return false
    if (checkOccupation(input, x + 1, y)) return false
    if (checkOccupation(input, x - 1, y)) return false
    if (checkOccupation(input, x + 1, y + 1)) return false
    if (checkOccupation(input, x + 1, y - 1)) return false
    if (checkOccupation(input, x - 1, y + 1)) return false
    if (checkOccupation(input, x - 1, y - 1)) return false
    return true
}

fun noAdjacentOccupationsInSight(input: Array<CharArray>, x: Int, y: Int): Boolean {
    //If a seat is empty (L) and there are no occupied seats adjacent to it, the seat becomes occupied.
    if (checkOccupationInLineOfSighet(input, x, y, 0, 1)) return false
    if (checkOccupationInLineOfSighet(input, x, y, 0, -1)) return false
    if (checkOccupationInLineOfSighet(input, x, y, 1, 0)) return false
    if (checkOccupationInLineOfSighet(input, x, y, -1, 0)) return false
    if (checkOccupationInLineOfSighet(input, x, y, 1, 1)) return false
    if (checkOccupationInLineOfSighet(input, x, y, 1, -1)) return false
    if (checkOccupationInLineOfSighet(input, x, y, -1, 1)) return false
    if (checkOccupationInLineOfSighet(input, x, y, -1, -1)) return false
    return true
}

fun fourOrMoreAdjacentOccupations(input: Array<CharArray>, x: Int, y: Int): Boolean {
    //If a seat is occupied (#) and four or more seats adjacent to it are also occupied, the seat becomes empty.
    var adjacent = 0
    if (checkOccupation(input, x, y + 1)) adjacent++
    if (checkOccupation(input, x, y - 1)) adjacent++
    if (checkOccupation(input, x + 1, y)) adjacent++
    if (checkOccupation(input, x - 1, y)) adjacent++
    if (checkOccupation(input, x + 1, y + 1)) adjacent++
    if (checkOccupation(input, x + 1, y - 1)) adjacent++
    if (checkOccupation(input, x - 1, y + 1)) adjacent++
    if (checkOccupation(input, x - 1, y - 1)) adjacent++
    return adjacent >= 4
}


fun fiveOrMoreAdjacentOccupationsInSight(input: Array<CharArray>, x: Int, y: Int): Boolean {
    //If a seat is occupied (#) and four or more seats adjacent to it are also occupied, the seat becomes empty.
    var adjacent = 0
    if (checkOccupationInLineOfSighet(input, x, y, 0, 1)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, 0, -1)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, 1, 0)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, -1, 0)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, 1, 1)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, 1, -1)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, -1, 1)) adjacent++
    if (checkOccupationInLineOfSighet(input, x, y, -1, -1)) adjacent++
    return adjacent >= 5
}

fun checkOccupation(input: Array<CharArray>, x: Int, y: Int): Boolean {
    return try {
        input[x][y] == '#'
    } catch (e: IndexOutOfBoundsException) {
        false
    }
}

fun checkOccupationInLineOfSighet(input: Array<CharArray>, x: Int, y: Int, offsetX: Int, offsetY: Int): Boolean {
    var newX = x
    var newY = y
    var char: Char
    do {
        newX += offsetX
        newY += offsetY
        try {
            char = input[newX][newY]
        } catch (e: IndexOutOfBoundsException) {
            return false
        }
    } while (char == '.')

    return char == '#'
}

fun getInputDay11(input: String): Array<CharArray> {
    val lines = input.lines()
    return Array(lines.size) { horizontal ->
        CharArray(lines[0].length) { vertical ->
            lines[horizontal][vertical]
        }
    }
}

val inputExample = """
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