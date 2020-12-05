package day4

fun main() {
    val passports = getInputDay4(day4Input)
    println("day4 part1 = ${getSolutionDay4Part1(passports)}")
    println("day4 part2 = ${getSolutionDay4Part2(passports)}")
}

fun getSolutionDay4Part1(passports: List<Passport>) = passports.fold(0) { acc, it -> if (it.valid) acc + 1 else acc }
fun getSolutionDay4Part2(passports: List<Passport>) = passports.fold(0) { acc, it -> if (it.valid2) acc + 1 else acc }

fun getInputDay4(input: String): List<Passport> {
    return input.split("\n\n")
        .map { it.replace(" ", "\n") }
        .map { Passport(it.lines()) }
}

data class Passport(val passValues: List<String>) {
    private val byr: String? = passValues.findValue("byr")
    private val iyr: String? = passValues.findValue("iyr")
    private val eyr: String? = passValues.findValue("eyr")
    private val hgt: String? = passValues.findValue("hgt")
    private val hcl: String? = passValues.findValue("hcl")
    private val ecl: String? = passValues.findValue("ecl")
    private val pid: String? = passValues.findValue("pid")
    private val cid: String? = passValues.findValue("cid")
    val valid = byr != null && iyr != null && eyr != null && hgt != null && hcl != null && ecl != null && pid != null
    val valid2: Boolean = valid
            && byr!!.toIntOrNull() in 1920..2002
            && iyr!!.toIntOrNull() in 2010..2020
            && eyr!!.toIntOrNull() in 2020..2030
            && hgt!!.run {
        val height = this.substring(0, this.length - 2).toIntOrNull()
        if (this.endsWith("cm") && height in 150..193) true
        else this.endsWith("in") && height in 59..76
    }
            && hcl!!.matches(Regex("^#([A-f]|[0-9]){6}"))
            && ecl!!.matches(Regex("(amb|blu|brn|gry|grn|hzl|oth)"))
            && pid!!.matches(Regex("[0-9]{9}"))

}

private fun List<String>.findValue(name: String): String? {
    return this.find { it.contains(name) }?.let { it.substring(it.indexOf(":") + 1) }
}

val inputExample = """
pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980
hcl:#623a2f

eyr:2029 ecl:blu cid:129 byr:1989
iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm

hcl:#888785
hgt:164cm byr:2001 iyr:2015 cid:88
pid:545766238 ecl:hzl
eyr:2022

iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719
""".trimIndent()