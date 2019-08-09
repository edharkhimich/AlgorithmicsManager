package array

object ArrayManager {
    fun bubbleSort(array: Array<Int>) {
        val start = System.currentTimeMillis()

        for (x in 0..array.size) {
            for (y in x downTo 0) {
                if (y + 1 < x) {
                    if (array[y] > array[y + 1]) {
                        array[y] = array[y + 1].also { array[y + 1] = array[y] }
                    }
                }
            }
        }
        val end = System.currentTimeMillis()
        Utils.displaySortDetails("Bubble sort", array.size, end - start)
    }

    fun selectionSort(array: Array<Int>) {
        val start = System.currentTimeMillis()
        var largestIndex: Int

        for (lx in array.size - 1 downTo 0) {
            for (n in 1..lx) {
                largestIndex = 0
                if (array[n] > array[largestIndex]) {
                    largestIndex = n
                }
                array[lx] = array[largestIndex]
                        .also { array[largestIndex] = array[lx] }
            }
        }
        val end = System.currentTimeMillis()

        Utils.displaySortDetails("Selection sort", array.size, end - start)
    }

    fun insertedSort(array: Array<Int>) {
        val start = System.currentTimeMillis()
        var newElement: Int

        if (array.size > 0) {
            var firstUnsortedIndex: Int = 1
            for (firstUnsorted in firstUnsortedIndex until array.size) {
                newElement = array[firstUnsorted]

                for (i in firstUnsorted downTo 0) {
                    if (i > 0 && array[i - 1] > newElement) {
                        array[i] = array[i - 1]
                    } else if (i > 0 && array[i - 1] < newElement || i == 0) {
                        array[i] = newElement
                        break
                    }
                }
            }
        }
        val end = System.currentTimeMillis()

        Utils.displaySortDetails("Inserted sort", array.size, end - start)
    }

    fun shellSort(array: Array<Int>) {
        val start = System.currentTimeMillis()

        var gap = array.size / 2
        var j: Int
        var temp: Int

        while (gap > 0) {

            var i = gap

            while (i < array.size) {
                temp = array[i]

                j = i

                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap]
                    j -= gap
                }

                array[j] = temp
                i += 1
            }
            gap /= 2
        }

        val end = System.currentTimeMillis()
        Utils.displaySortDetails("Shell sort", array.size, end - start)

    }

    fun mergeSort(array: Array<Int>, start: Int, end: Int) {
        val s = System.currentTimeMillis()
        mergeSortImpl(array, start, end)
        val e = System.currentTimeMillis()
        Utils.displaySortDetails("Merge sort", array.size, e - s)
    }

    fun mergeSortImpl(arr: Array<Int>, start: Int, end: Int) {

        if (end - start < 2) return

        val mid = (start + end) / 2

        mergeSortImpl(arr, start, mid)
        mergeSortImpl(arr, mid, end)
        merge(arr, start, mid, end)
    }

    private fun merge(arr: Array<Int>, start: Int, mid: Int, end: Int) {

        if (arr[mid - 1] <= arr[mid]) return

        var i = start
        var j = mid
        var tempIndex = 0

        var tempArray = Array<Int>(end - start, { i -> i })


        while (i < mid && j < end) {
            tempArray[tempIndex++] = if (arr[i] <= arr[j]) arr[i++] else arr[j++]
        }

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i)
        System.arraycopy(tempArray, 0, arr, start, tempIndex)

    }

    /** This algorithm is better to use when we have not a huge range of Integers.
	 * The type should be only an Int. */
    fun countSort(arr: Array<Int>) {
        if (arr.isEmpty()) return
        arr.max()?.let { max ->
            println("maxValue = $max")

            val spacingArray = Array(max) { 0 }

            arr.forEach { i -> spacingArray[i - 1] += 1 }

            var counter = 0
            spacingArray.forEachIndexed { index, i ->
                if (i > 0) {
                    for (x in 0 until i) {
                        arr[counter] = index + 1
                        counter++
                    }
                }
            }
        }
    }

}
