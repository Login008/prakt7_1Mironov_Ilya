fun main() {
    try
    {
        print("Введите первый член арифметической прогрессии: ")
        var firstTerm = readLine()!!.toInt()
        print("Введите пятый член арифметической прогрессии: ")
        var fifthTerm = readLine()!!.toInt()
        if (firstTerm < fifthTerm) {
            print("Введите номер искомого члена арифметической прогрессии: ")
            var n = readLine()!!.toInt()
            if (n > 0) {
                var difference = (fifthTerm - firstTerm) / 4
                var value = firstTerm + difference * (n - 1)
                var sum = (n / 2) * (2 * firstTerm + (n - 1) * difference)

                println("Величина члена прогрессии с номером $n: $value")
                println("Сумма $n членов прогрессии: $sum")
            } else
            {
                println("Номер члена не может быть меньше единицы")
            }
        } else
        {
            println("Пятый член обязательно должен быть больше первого, т.к. это прогрессия")
        }
    }
    catch (e:Exception)
    {
        println("Неверный формат данных")
    }
}