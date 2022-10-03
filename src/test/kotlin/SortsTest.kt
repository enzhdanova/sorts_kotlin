import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortsTest {
    @Test
    fun bubbleSortsDown() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
    }

    @Test
    fun bubbleSorts() {
        val intArrayForSort = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
    }

    @Test
    fun bubbleSorts2() {
        val intArrayForSort = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray = intArrayOf(1, 1, 1, 1, 1)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
    }
}