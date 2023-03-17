fun main() {
    val minComisssion = 35
    val percentComission = 0.75
    val amount = 10000
    val result = if ((amount * percentComission) / 100 < minComisssion) amount - minComisssion else amount - ((amount * percentComission) / 100)
    println(result)
}