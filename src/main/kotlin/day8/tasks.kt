package day8


fun main() {
    println("day 8 part1 ${runProgram(getInputDay8(day8Input), 0, 0)}")
    println("day 8 part2 ${findFixedProgram(getInputDay8(day8Input))}")
}

fun findFixedProgram(instructions: List<Instruction>): Int =
    instructions.foldIndexed(0) { index, notFound, it ->
        val testInstruction = when (it.operational) {
            "nop" -> it.copy(operational = "jmp")
            "jmp" -> it.copy(operational = "nop")
            else -> null
        }
        testInstruction?.let {
            val mutableList = instructions.map { it.copy() }.toMutableList()
            mutableList.removeAt(index)
            mutableList.add(index, it)
            val res = checkProgram(mutableList, 0, 0)
            if (res > 0) return@foldIndexed res
        }
        notFound
    }

fun runProgram(instructions: List<Instruction>, argument: Int, accumulator: Int): Int {
    val instruction = instructions[argument]
    if (instruction.visited) return accumulator else instruction.visited = true
    return when (instruction.operational) {
        "nop" -> runProgram(instructions, argument + 1, accumulator)
        "acc" -> runProgram(instructions, argument + 1, accumulator + instruction.argument)
        "jmp" -> runProgram(instructions, argument + instruction.argument, accumulator)
        else -> throw Exception("Should not happen")
    }
}

fun checkProgram(instructions: List<Instruction>, argument: Int, accumulator: Int): Int {
    if (argument == instructions.size) return accumulator
    if (argument > instructions.size) return 0
    val instruction = instructions[argument]
    if (instruction.visited) return 0 else instruction.visited = true
    return when (instruction.operational) {
        "nop" -> checkProgram(instructions, argument + 1, accumulator)
        "acc" -> checkProgram(instructions, argument + 1, accumulator + instruction.argument)
        "jmp" -> checkProgram(instructions, argument + instruction.argument, accumulator)
        else -> throw Exception("Should not happen")
    }
}

fun getInputDay8(input: String) = input.lines().map {
    val split = it.split(" ")
    Instruction(split[0], split[1].toInt(), false)
}

data class Instruction(val operational: String, val argument: Int, var visited: Boolean)

val inputExample = """
nop +0
acc +1
jmp +4
acc +3
jmp -3
acc -99
acc +1
jmp -4
acc +6
""".trimIndent()