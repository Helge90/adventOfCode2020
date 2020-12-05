package day1

fun main(){

    val list: List<Int> = getInputDay1(day1Input)
    println("day1 part1 = ${part1(list)}")
    println("day1 part2 = ${part2(list)}")
}

fun getInputDay1(input: String) = input.lines().map { it.toInt() }

    //OOF
   fun part1(list: List<Int>) : Int {
        list.forEach{ firstElem ->
            val secondList = list.toMutableList()
            secondList.removeAt(list.indexOf(firstElem))
            secondList.forEach{ secondElem ->
                run {
                    if (firstElem + secondElem  == 2020) {
                        return firstElem * secondElem
                    }
                }

            }
        }
        return 0
   }


fun part2(list: List<Int>): Int{
    list.forEach{ firstElem ->
        val secondList = list.toMutableList()
        secondList.removeAt(list.indexOf(firstElem))
        secondList.forEach{ secondElem ->
            val thirdList = secondList.toMutableList()
            thirdList.removeAt(secondList.indexOf(secondElem))
            thirdList.forEach{ thirdElem ->
                run {
                    if (firstElem + secondElem + thirdElem == 2020) {
                        return firstElem * secondElem * thirdElem
                    }
                }

            }

        }
    }
    return 0
}

