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

        val intArrayForSort4 = intArrayOf(500, 300, 30, 70, 150, 20, 10)
        val resultIntArray4 = intArrayOf(10, 20, 30, 70, 150, 300, 500)

        val result = heapSort(intArrayForSort)
        val result2 = heapSort(intArrayForSort2)
        val result3 = heapSort(intArrayForSort3)
        val result4 = heapSort(intArrayForSort4)

        assertArrayEquals(resultIntArray, result)
        assertArrayEquals(resultIntArray2, result2)
        assertArrayEquals(resultIntArray3, result3)
        assertArrayEquals(resultIntArray4, result4)
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
        val intArrayForSort = intArrayOf(5, 4, 3, 2, 1)
        val resultIntArray = intArrayOf(5, 4, 3, 2, 1)

        for (i in intArrayForSort.size / 2  - 1 downTo 0) {
            val resultHeap = getHeap(intArrayForSort, intArrayForSort.size, i)
            assertArrayEquals(resultIntArray, resultHeap)
        }

        val resultHeap = getHeap(intArrayForSort, intArrayForSort.size, 0)
        assertArrayEquals(resultIntArray, resultHeap)
    }
}