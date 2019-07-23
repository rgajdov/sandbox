import Color.*

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


}

fun main(args: Array<String>) {
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
}
