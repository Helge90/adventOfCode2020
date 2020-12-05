package day5

fun secondAttempt() {
    val seatIds = day5Input.lines().map {
        val binaryNumber = it.fold("") { acc, c ->
            if (c == 'L' || c == 'F') acc + '0'
            else acc + '1'
        }
        Integer.parseInt(binaryNumber,2)
    }
    println("highest seatId = ${seatIds.maxOrNull()}")
    val mySeat = seatIds.sorted().reduce{
            first, second -> if (second - first == 1 ) second else return@reduce first
    } + 1
    println( "my SeatId = $mySeat")
}
