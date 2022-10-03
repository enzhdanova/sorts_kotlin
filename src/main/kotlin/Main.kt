fun main(args: Array<String>) {
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

fun quickSort(intArrayOf: IntArray): IntArray {
    return intArrayOf
}