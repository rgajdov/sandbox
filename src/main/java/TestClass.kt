import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import java.util.*

class TestClass {
    internal fun almostIncreasingSequence3(sequence: IntArray): Boolean {
        var invalidItemsCount = 0
        for (i in 1 until sequence.size) {
            if (sequence[i] <= sequence[i - 1]) {
                invalidItemsCount++
                if (invalidItemsCount > 1)
                    return false

                if (i == sequence.size - 1 && invalidItemsCount == 1)
                    return true

                if (i > 1)
                    if (sequence[i] <= sequence[i - 2] && sequence[i + 1] <= sequence[i - 1])
                        return false
            }
        }
        return true
    }

    fun max(a: Int, b: Int): Int {
        val result = if (a > b) a else b
        println("Max number is $result")
        //return if (a > b) a else b
        return result
    }

    internal fun max2(a: Int, b: Int): Int = if (a > b) a else b

    internal fun greeting(name: String) {
        if (name == "Bob")
            println("Hello, $name!")
    }

    internal fun fizzBuzz(i: Int) = when {
        i % 15 == 0 -> "FizzBuzz "
        i % 3 == 0 -> "Fizz "
        i % 5 == 0 -> "Buzz "
        else -> "$i "
    }

    fun readNumber(reader: BufferedReader): Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        }
        catch (e: NumberFormatException) {
            return null
        }
        finally {
            reader.close()
        }
    }

    fun readNumber2(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            return
        }
        println(number)
    }

    fun setOfNums() {
        val set = hashSetOf(1, 72, 53)
        val list = arrayListOf(1, 7, 53)
        val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
        val strings = listOf("first", "second", "third")

        println(joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))
        println(joinToString(list, ",", "", ""))
        println(joinToString(list))
        println(joinToString(list, postfix = ";", prefix = "# "))

        println(strings.last())
        println(set.max())

        println(set.javaClass)
        println(list.javaClass)
        println(map.javaClass)
    }

    fun <T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "", postfix: String = ""): String {
        val result = StringBuilder(prefix)
        for ((index, element) in collection.withIndex()) {
            if (index > 0) result.append(separator)
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }


}

fun main(args: Array<String>) {
    val tc = TestClass()
//    for (i in 1 until 10) {
//        print(tc.fizzBuzz(i))
//    }

    tc.setOfNums()

    val reader = BufferedReader(StringReader("not a num"))
    //println(tc.readNumber(reader))
    tc.readNumber2(reader)


    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    ////////

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }


    /*
    val tc = TestClass()
    tc.max(9, 12)
    println("Max number is ${tc.max2(56, 32)}")

    tc.greeting("Bob")

    val person = Person("Alice", true)
    println(person.name)
    println(person.isMarried)

    val rect = Rectangle(25, 25)
    println(rect.isSquare)

    println(Color.BLUE.rgb())

    fun getMnemonic(color: Color) =
            when (color) {
                Color.RED -> "Каждый "
                Color.ORANGE -> "охотник "
                Color.YELLOW -> "желает "
                Color.GREEN -> "знать "
                Color.BLUE -> "где "
                Color.INDIGO -> "сидит "
                Color.VIOLET -> "фазан"
            }

    println(getMnemonic(Color.GREEN))

    fun getWarmth(color: Color) = when (color) {
        RED, ORANGE, YELLOW -> "теплый"
        GREEN -> "нейтральный"
        BLUE, Color.INDIGO, Color.VIOLET -> "холодный"
    }

    println(getWarmth(Color.YELLOW))
    println(getWarmth(Color.BLUE))
    println(getWarmth(Color.GREEN))
    */
}
