package day7

fun main() {
    val lines = getInputDay7(day7Input)
    val sum = day7Part1(createBagRulesPart1(lines))
    println("day7 part1 = $sum")
    val sum2 = findAllBags(createBagRulesPart2(lines), "shiny gold bag", 0)
    println("day7 part2 = $sum2")
}

fun day7Part1(bagRules: HashMap<String, List<String>>) = bagRules.entries.fold(0) { acc, entrie ->
    when {
        entrie.key == "shiny gold bag" -> acc
        canContainGolden(bagRules, entrie.key, entrie.value, 2) -> acc + 1
        else -> acc
    }
}

fun createBagRulesPart1(input: List<String>): HashMap<String, List<String>> {
    val bagRules: HashMap<String, List<String>> = hashMapOf()
    input.forEach {
        val keyValue: List<String> = it.split("contain", ",")
        for (i in 1 until keyValue.size) {
            val key = keyValue[0].drop(0).trim().replace(".", "").trimEnd('s')
            val value = keyValue[i].drop(2).trim().replace(".", "").trimEnd('s')
            bagRules[key] = if (bagRules[key] == null) listOf(value) else bagRules[key]!! + value
        }
    }
    return bagRules
}

fun createBagRulesPart2(input: List<String>): HashMap<String, List<Rules>> {
    val bagRulesPart2: HashMap<String, List<Rules>> = hashMapOf()
    input.forEach {
        val keyValue: List<String> = it.split("contain", ",")
        for (i in 1 until keyValue.size) {
            val key = keyValue[0].drop(0).trim().replace(".", "").trimEnd('s')
            val value = keyValue[i].drop(2).trim().replace(".", "").trimEnd('s')
            val number = keyValue[i].take(2).replace(" ", "").toIntOrNull() ?: 0
            bagRulesPart2[key] =
                if (bagRulesPart2[key] == null) listOf(Rules(key, value, number)) else bagRulesPart2[key]!! + Rules(
                    key,
                    value,
                    number
                )
        }
    }
    return bagRulesPart2
}

fun findAllBags(bagRulesPart2: HashMap<String, List<Rules>>, key: String, depth: Int): Int {
    val list = bagRulesPart2[key]
    return list?.fold(0) { acc: Int, it: Rules ->
        val sum = (acc + (it.number + (it.number * findAllBags(bagRulesPart2, it.value, depth + 1))))
        sum
    } ?: 0
}

data class Rules(val key: String, val value: String, val number: Int)

fun canContainGolden(bagRules: HashMap<String, List<String>>, key: String, values: List<String>?, depth: Int): Boolean {
    if (values == null) return false
    if (values.contains("shiny gold bag")) return true
    else return values.fold(false) { allTrue: Boolean, s: String ->
        if (canContainGolden(bagRules, "$key -> $s", bagRules[s], depth + 1)) return true else allTrue
    }
}

fun getInputDay7(input: String) = input.lines()


val inputExample = """
light red bags contain 1 bright white bag, 2 muted yellow bags.
dark orange bags contain 3 bright white bags, 4 muted yellow bags.
bright white bags contain 1 shiny gold bag.
muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.
shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.
dark olive bags contain 3 faded blue bags, 4 dotted black bags.
vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.
faded blue bags contain no other bags.
dotted black bags contain no other bags.
""".trimIndent()

val inputExample2 = """
shiny gold bags contain 2 dark red bags.
dark red bags contain 2 dark orange bags.
dark orange bags contain 2 dark yellow bags.
dark yellow bags contain 2 dark green bags.
dark green bags contain 2 dark blue bags.
dark blue bags contain 2 dark violet bags.
dark violet bags contain no other bags.
""".trimIndent()