import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortsTest {
    @Test
    fun bubbleSortsDown() {
        val result = sortBubble(intArrayOf(5, 4, 3, 2, 1))
        val resultQuickSort = quickSort(intArrayOf(5, 4, 3, 2, 1))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), resultQuickSort)
    }

    @Test
    fun bubbleSorts() {
        val result = sortBubble(intArrayOf(4, 5, 3, 1, 2))
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), result)
    }

    @Test
    fun bubbleSorts2() {
        val result = sortBubble(intArrayOf(1, 1, 1, 1, 1))
        assertArrayEquals(intArrayOf(1, 1, 1, 1, 1), result)
    }
}