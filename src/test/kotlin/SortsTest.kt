import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SortsTest {
    @Test
    fun bubbleSort() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort2 = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray2 = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort3 = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray3 = intArrayOf(1, 1, 1, 1, 1)

        val result = sortBubble(intArrayForSort)
        val result2 = sortBubble(intArrayForSort2)
        val result3 = sortBubble(intArrayForSort3)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray2, result2)
        assertArrayEquals(resultIntArray3, result3)
    }

    @Test
    fun quickSort() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort2 = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray2 = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort3 = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray3 = intArrayOf(1, 1, 1, 1, 1)

        val result = quickSort(intArrayForSort, 0, intArrayForSort.size - 1)
        val result2 = quickSort(intArrayForSort2, 0, intArrayForSort2.size - 1)
        val result3 = quickSort(intArrayForSort3, 0, intArrayForSort3.size - 1)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray2, result2)
        assertArrayEquals(resultIntArray3, result3)
    }

    @Test
    fun mergeSort() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort2 = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray2 = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort3 = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray3 = intArrayOf(1, 1, 1, 1, 1)

        val result = mergeSort(intArrayForSort, 0, intArrayForSort.size - 1)
        val result2 = mergeSort(intArrayForSort2, 0, intArrayForSort2.size - 1)
        val result3 = mergeSort(intArrayForSort3, 0, intArrayForSort3.size - 1)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray2, result2)
        assertArrayEquals(resultIntArray3, result3)
    }

    @Test
    fun heapSort() {
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort2 = intArrayOf(4, 5, 3, 1, 2)
        val resultIntArray2 = intArrayOf(1, 2, 3, 4, 5)

        val intArrayForSort3 = intArrayOf(1, 1, 1, 1, 1)
        val resultIntArray3 = intArrayOf(1, 1, 1, 1, 1)

        val result = heapSort(intArrayForSort)
        val result2 = heapSort(intArrayForSort2)
        val result3 = heapSort(intArrayForSort3)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray2, result2)
        assertArrayEquals(resultIntArray3, result3)
    }

    @Test
    fun mergeSortedArray(){
        val intArrayForSort1 = intArrayOf(5)
        val intArrayForSort12 = intArrayOf(4)
        val resultIntArray1 = intArrayOf(4, 5)

        val resultMerge1 = merge(intArrayForSort1, intArrayForSort12)
        assertArrayEquals(resultIntArray1, resultMerge1)

        val intArrayForSort2 = intArrayOf(4, 5)
        val intArrayForSort22 = intArrayOf(1, 2)
        val resultIntArray2 = intArrayOf(1, 2, 4, 5)

        val resultMerge2 = merge(intArrayForSort2, intArrayForSort22)
        assertArrayEquals(resultIntArray2, resultMerge2)

        val intArrayForSort3 = intArrayOf(1, 2)
        val intArrayForSort32 = intArrayOf(3, 4, 5)
        val resultIntArray3 = intArrayOf(1, 2, 3, 4, 5)

        val resultMerge3 = merge(intArrayForSort3, intArrayForSort32)
        assertArrayEquals(resultIntArray3, resultMerge3)
    }

    @Test
    fun getHeap(){
        val intArrayForSort = intArrayOf(24, 31, 15, 20,52, 6)
        val resultIntArray = intArrayOf(52, 24, 15, 20, 31, 6)

        val resultHeap = getHeap(intArrayForSort, intArrayForSort.size)
        assertArrayEquals(resultIntArray, resultHeap)

        val intArrayForSort2 = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray2 = intArrayOf(5, 4, 3, 2, 1)

        val resultHeap2 = getHeap(intArrayForSort2, intArrayForSort.size)
        assertArrayEquals(resultIntArray2, resultHeap2)
    }
}