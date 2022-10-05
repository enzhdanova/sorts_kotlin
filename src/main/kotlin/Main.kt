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


fun getHeap(array: IntArray, heapLen : Int): IntArray {
    val k = array.size / 2 - 1

    var tmp: Int

    for (i in k downTo 0) {
        val leftLeaf = 2 * i + 1
        val rightLeaf = 2 * i + 2
        if (leftLeaf < heapLen  && array[i] < array[leftLeaf]) {
            tmp = array[i]
            array[i] = array[leftLeaf]
            array[leftLeaf] = tmp
        }

        if (rightLeaf < heapLen  && array[i] < array[rightLeaf]) {
            tmp = array[i]
            array[i] = array[rightLeaf]
            array[rightLeaf] = tmp
        }
    }

    return array
}

fun heapSort(array: IntArray) : IntArray {

    for (i in array.size - 1  downTo 1) {
        getHeap(array, i + 1)

        val tmp = array[0]
        array[0] = array[i]
        array[i] = tmp
    }


    return array
}

