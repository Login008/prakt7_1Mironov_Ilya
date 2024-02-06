import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.tan
import kotlin.math.exp

fun main()
{
    try
    {
        print("Введите число x: ")
        var x = readLine()!!.toDouble()
        print("Введите число y: ")
        var y = readLine()!!.toDouble()
        print("Введите число z: ")
        var z = readLine()!!.toDouble()

        var a = (3 + exp(y - 1)) / (1 + x.pow(2) * abs(y - tan(z)))
        var b = 1 + abs(y - x) + (y - x).pow(2) / 2 + abs((y - x).pow(3)) / 3

        println("Значение a = ${String.format("%.2f", a)}\nЗначение b = ${String.format("%.2f", b)}")
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}