package array

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

