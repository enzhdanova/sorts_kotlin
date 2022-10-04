import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortsTest {
    @Test
    fun bubbleSortsDown() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size - 1)
        val resultMergeSort = mergeSort(intArrayForSort, 0, intArrayForSort.size - 1)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
        assertArrayEquals(resultIntArray, resultMergeSort)
    }

    @Test
    fun bubbleSorts() {
        val intArrayForSort = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size - 1)
        val resultMergeSort = mergeSort(intArrayForSort, 0, intArrayForSort.size - 1)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
        assertArrayEquals(resultIntArray, resultMergeSort)
    }

    @Test
    fun bubbleSorts2() {
        val intArrayForSort = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray = intArrayOf(1, 1, 1, 1, 1)

        val result = sortBubble(intArrayForSort)
        val resultQuickSort = quickSort(intArrayForSort, 0, intArrayForSort.size - 1)
        val resultMergeSort = mergeSort(intArrayForSort, 0, intArrayForSort.size - 1)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray, resultQuickSort)
        assertArrayEquals(resultIntArray, resultMergeSort)
    }

    @Test
    fun mergeSortedInt(){
        val intArrayForSort = intArrayOf(1, 2, 3, 4, 5)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val resultMerge = merge(intArrayForSort, 0, intArrayForSort.size / 2, intArrayForSort.size - 1)
        assertArrayEquals(resultIntArray, resultMerge)
    }
}