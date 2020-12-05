package day5

fun main() {
    val lines = getInputDay5(day5Input)

    val sortedSeats = lines.sortedBy { it.seatId }
    println("day5 part1 = ${sortedSeats.last().seatId}")

    val mySeatId = getMySeatId(sortedSeats)
    println("day5 part2 = $mySeatId")
}

fun getMySeatId(sortedSeats: List<Seat>) = sortedSeats.reduce { first, second ->
    if (second.seatId - first.seatId == 1) second else return@reduce first
}.seatId + 1

fun getInputDay5(input: String)  = input.lines().map { Seat(it.dropLast(3), it.drop(7)) }

data class Seat(private val rowPath: String, private val columnPath: String) {
    private val row = findRow()
    private val column = findColumn()
    val seatId = row * 8 + column
    private fun findColumn(): Int = findValue((0..7).toList(), columnPath.toCharArray(), 'L').first()
    private fun findRow(): Int = findValue((0..127).toList(), rowPath.toCharArray(), 'F').first()
}

fun findValue(range: List<Int>, path: CharArray, deliminator: Char): List<Int> {
    return path.fold(range) { p, c ->
        if (c == deliminator) p.subList(0, p.size / 2)
        else p.subList(p.size / 2, p.size)
    }
}

val inputExample = """
BFFFBBFRRR
FFFBBBFRRR
BBFFBBFRLL
""".trimIndent()