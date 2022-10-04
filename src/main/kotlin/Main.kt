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
        while (i <= indexMediana && array[i] <= mediana) {
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

    if (endIndex - indexMediana - 1 > 1) {
        quickSort(array, indexMediana, endIndex - 1)
    }

    return array
}


fun mergeSort(array: IntArray, startIndex: Int, endIndex: Int): IntArray {
    if (startIndex >= endIndex)
        return array

    val mediana = (startIndex+endIndex + 1) / 2

    mergeSort(array, startIndex, mediana-1)
    mergeSort(array, mediana, endIndex)

    val resultArray = merge(array, startIndex, mediana, endIndex)

    return resultArray
}

fun merge(array: IntArray, startIndex: Int, mediana: Int, endIndex: Int) : IntArray {
    var i = startIndex
    var j = mediana
    var index = 0
    val arrayTmp = IntArray(endIndex - startIndex + 1)
    while (i < mediana && j < endIndex) {
        if (array[i] < array[j]) {
            arrayTmp[index] = array[i]
            i++
        } else {
            arrayTmp[index] = array[j]
            j++
        }
        index++
    }

    while (i < mediana) {
        arrayTmp[index] = array[i]
        index++
        i++
    }

    while (j <= endIndex) {
        arrayTmp[index] = array[j]
        index++
        j++
    }

    return arrayTmp
}