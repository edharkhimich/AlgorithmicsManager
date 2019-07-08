import java.sql.Time
import kotlin.random.Random
import array.selectionSort

fun main() {
	val array = Array<Int>(1_000_0, { (-1000..100000).random() })
		
	selectionSort(array)
}






