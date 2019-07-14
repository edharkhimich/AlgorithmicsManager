import java.sql.Time
import kotlin.random.Random
import array.ArrayManager.insertedSort
import array.ArrayManager.bubbleSort
import array.ArrayManager.selectionSort

fun main() {
	val array = Array<Int>(1_000_0, { (-1000..100000).random() })

	val tempArray = arrayOf(1, -24, 11, 32, -5, 26, 3, -44, 21, 32)

	bubbleSort(array)
	selectionSort(array)
	insertedSort(array)


}






