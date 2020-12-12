package day9


fun main() {
    println("day 9 part1 ${validateNumbers(getInputDay9(day9Input), 25)}")
    println("day 9 part2 ${findContiguousListForLong(getInputDay9(day9Input), 10884537)}")
}


fun getInputDay9(input: String) = input.lines().map { it.toLong() }

fun validateNumbers(numberList: List<Long>, preamble: Int): Long {
    numberList.subList(preamble, numberList.size - 1).forEachIndexed { index, it ->
        if (!checkIfValid(numberList.subList(0 + index, preamble + index), it)) return it
    }
    throw Error("found no invalid numbers")
}

fun checkIfValid(numberList: List<Long>, toCheck: Long): Boolean =
    numberList.fold(false) { acc, pre ->
        val check = toCheck - pre
        if (acc) true
        else numberList.contains(check) && pre != check
    }

fun findContiguousListForLong(numberList: List<Long>, toSum: Long): Long {
    numberList.fold(mutableListOf<Long>()) { acc, l ->
        while (acc.sum() > toSum) {
            acc.removeAt(0)
        }
        if (acc.sum() == toSum) return acc.minOrNull()!! + acc.maxOrNull()!!
        acc.add(l)
        acc
    }
    throw Error("found no contiguous list")
}

val inputExample = """
35
20
15
25
47
40
62
55
65
95
102
117
150
182
127
219
299
277
309
576
""".trimIndent()