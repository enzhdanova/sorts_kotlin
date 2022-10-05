fun main(args: Array<String>) {
}


fun sortBubble(array: IntArray): IntArray {
    var tmp = 0
    for (i in 1 until array.size) {
        for (j in 0 until array.size - i) {
            if (array[j] > array[j + 1]) {
                tmp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = tmp
            }
        }
    }

    return array
}

fun quickSort(array: IntArray, startIndex: Int, endIndex: Int): IntArray {
    val indexMediana = (endIndex + startIndex) / 2
    val mediana = array[indexMediana]

    var tmp: Int
    var i = startIndex
    var j = endIndex

    while (i < j) {
        while (i < indexMediana && array[i] <= mediana) {
            i++
        }

        while (j > indexMediana && array[j] >= mediana) {
            j--
        }

        if (i < j) {
            tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
        }
    }

    if (indexMediana - startIndex > 1) {
        quickSort(array, startIndex, indexMediana - 1)
    }

    if (endIndex - indexMediana > 1) {
        quickSort(array, indexMediana, endIndex)
    }

    return array
}


fun mergeSort(array: IntArray, startIndex: Int, endIndex: Int): IntArray {
    if (startIndex >= endIndex)
        return intArrayOf(array[startIndex])

    val mediana = (startIndex + endIndex + 1) / 2
    val res1 = mergeSort(array, startIndex, mediana - 1)
    val res2 = mergeSort(array, mediana, endIndex)

    val resultArray = merge(res1, res2)
    return resultArray
}

fun merge(array1: IntArray, array2: IntArray): IntArray {
    var i = 0
    var j = 0
    val l1 = array1.size
    val l2 = array2.size
    var index = 0
    val arrayTmp = IntArray(array1.size + array2.size)
    while (i < l1 && j < l2) {
        if (array1[i] < array2[j]) {
            arrayTmp[index] = array1[i]
            i++
        } else {
            arrayTmp[index] = array2[j]
            j++
        }
        index++
    }

    while (i < l1) {
        arrayTmp[index] = array1[i]
        index++
        i++
    }

    while (j < l2) {
        arrayTmp[index] = array2[j]
        index++
        j++
    }

    return arrayTmp
}


fun getHeap(array: IntArray, heapLen: Int, indexNowNode: Int): IntArray {
    var indexMax = indexNowNode
    val swap: Int

    val leftChild = 2 * indexNowNode + 1
    val rightChild = 2 * indexNowNode + 2
    if (leftChild < heapLen && array[indexMax] < array[leftChild]) {
        indexMax = leftChild
    }

    if (rightChild < heapLen && array[indexMax] < array[rightChild]) {
        indexMax = rightChild
    }

    if (indexMax != indexNowNode) {
        swap = array[indexNowNode]
        array[indexNowNode] = array[indexMax]
        array[indexMax] = swap

        getHeap(array, heapLen, indexMax)
    }

    return array
}

fun heapSort(array: IntArray): IntArray {

    for (i in array.size / 2  - 1 downTo 0) {
        getHeap(array, array.size, i)
    }

    for (i in array.size - 1 downTo 0) {
        val tmp = array[0]
        array[0] = array[i]
        array[i] = tmp

        getHeap(array, i, 0)
    }


    return array
}

