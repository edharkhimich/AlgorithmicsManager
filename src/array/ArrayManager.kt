package array

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

