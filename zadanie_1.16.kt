import kotlin.math.sqrt

fun main() {
    try {
    print("Введите длину радиуса: ")
    var r = readLine()!!.toDouble()
    if (r > 0) {
        print("Введите значение тангенса: ")
        var k = readLine()!!.toDouble()
        if ((k > 0) and (k <= 1)) {
            var a = 1 + k * k
            var b = 1 - 2 * k
            var c = -r * r

            var discriminant = b * b - 4 * a * c

            var x1 = (-b + sqrt(discriminant)) / (2 * a)
            var y1 = k * x1

            var x2 = (-b - sqrt(discriminant)) / (2 * a)
            var y2 = k * x2

            println("Координаты точек пересечения: (${String.format("%.2f", x1)}; ${String.format("%.2f", y1)}), (${String.format("%.2f", x2)}; ${String.format("%.2f", y2)})")
        } else
        {
            println("Значение тангенса не может быть меньше или равно нулю и не может быть больше единицы")
        }
    } else
    {
        println("Значение радиуса не может быть меньше или равно нулю")
    }
    } catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}