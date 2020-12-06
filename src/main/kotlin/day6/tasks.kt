package day6

fun main() {
    val lines = getInputDay6(day6Input)
    println("day6 part1 = ${countnumberOfYesAnswers(lines)}")
    println("day6 part2 = ${countnumberOfYesFromAllInGroup(lines)}")
}

fun getInputDay6(input: String) = input.split("\n\n")

fun countnumberOfYesAnswers(answers: List<String>) = answers.fold(0) { acc, a ->
    var count = 0
    for (ch in 'a'..'z') {
        if (a.contains(ch)) count += 1
    }
    acc + count
}

fun countnumberOfYesFromAllInGroup(answers: List<String>): Int {
    val groupedAnswers = answers.map { it.split("\n") }
    return groupedAnswers.fold(0) { acc, group ->
        var count = 0
        for (ch in 'a'..'z') {
            if (group.fold(true) { allTrue, s -> if (allTrue) s.contains(ch) else false }) count += 1
        }
        acc + count
    }
}

val inputExample = """
abc

a
b
c

ab
ac

a
a
a
a

b
""".trimIndent()