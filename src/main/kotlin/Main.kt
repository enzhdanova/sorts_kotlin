fun main(args: Array<String>) {
    val array = Values.intArray.copyOf()
}


fun sortBubble(array: IntArray): IntArray {
    var tmp = 0
    for (i in 1 until array.size) {
        for (j in 0 until array.size - i) {
            if (array[j] > array[j+1]){
                tmp = array[j]
                array[j] = array[j+1]
                array[j+1] = tmp
            }
        }
    }

    return array
}

fun quickSort(array: IntArray, startIndex: Int, endIndex: Int): IntArray {
    val indexMediana = startIndex + (endIndex - startIndex) / 2
    val mediana = array[indexMediana]

    var tmp = 0
    var i = startIndex
    var j = endIndex - 1

    while (i < j) {
        while (i <= indexMediana && array[i] <= mediana) {
            i++
        }

        while (j >= indexMediana && array[j] >= mediana) {
            j--
        }

        if (i < j) {
            tmp = array[i]
            array[i] = array[j]
            array[j] = tmp
        }
    }

    if (indexMediana - startIndex> 1) {
        quickSort(array, startIndex, indexMediana - 1)
    }

    if (endIndex - indexMediana > 1) {
        quickSort(array, indexMediana, endIndex)
    }

    return array
}