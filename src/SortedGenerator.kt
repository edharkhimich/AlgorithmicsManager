import java.sql.Time
import kotlin.random.Random
import array.selectionSort
import array.bubbleSort

fun main() {
	val array = Array<Int>(1_000_0, { (-1000..100000).random() })
		
	val tempArray = arrayOf(1, -24, 11, 32, -5, 26)
	bubbleSort(array)
	selectionSort(array)
}






