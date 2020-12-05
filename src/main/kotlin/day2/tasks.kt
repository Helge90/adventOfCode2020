package day2

fun main(){

    println("day2 part1 = ${getValidPasswords(day2Input.lines())}")
    println("day2 part2 = ${getValidPasswordsNewRules(day2Input.lines())}")

}

fun getValidPasswords(input : List<String>): Int{
    val firstList = input.map {
        val split = it.split("-", ":", " ")
        Password(split[0].toInt(),split[1].toInt(), split[2].toCharArray()[0], split[4]) }
    val filter = firstList.filter {
        it.validateFirstRule()
    }
    return filter.size
}

fun getValidPasswordsNewRules(input : List<String>): Int{
    val firstList = input.map {
        val split = it.split("-", ":", " ")
        Password(split[0].toInt(),split[1].toInt(), split[2].toCharArray()[0], split[4]) }
    val filter = firstList.filter {
        it.validateSecondRule()
    }
    return filter.size
}

private data class Password(val firstInt: Int, val secondInt: Int, val char : Char,  val password: String ){
    fun validateFirstRule() : Boolean{
        val hits = password.count { it == char }
        return hits in firstInt until (secondInt+1)
    }

    fun validateSecondRule() : Boolean{
        if (password[firstInt -1 ] == char && password[secondInt -1 ] != char) return true
        if (password[firstInt -1 ] != char && password[secondInt -1 ] == char) return true
        return false
    }
}
