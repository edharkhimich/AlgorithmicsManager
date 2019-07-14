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
		Utils.displaySortDetails("Inserted sort", array.size, end - start)

	}
}