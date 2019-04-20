import com.ilgonmic.Animal
import com.ilgonmic.Animal2

fun create() {
    val rabbit = Rabbit()
    val rabbit2 = Rabbit2()
    println(rabbit)
    println(rabbit2)
}

private class Rabbit : Animal("rabbit")
private class Rabbit2 : Animal2("rabbit2")