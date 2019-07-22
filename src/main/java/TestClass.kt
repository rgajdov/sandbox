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
}
