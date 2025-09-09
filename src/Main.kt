//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    println("Выберите действие")
    println("1) деление || 2)умножение || 3)сложение || 4)вычитание")
    val choice = readLine()!!.toInt()
    print("Запишите первую переменную: ")
    val num1 = readLine()!!.toDouble()
    print("Запишите вторую переменную: ")
    val num2 = readLine()!!.toDouble()
    if (choice == 1)
    {
        if (num1 == .0 || num2 == .0)
        {
            println("Нельзя делить на ноль")
        }
        if (num1 > num2)
        {
            val result1 = num1 / num2
            println(result1)
        }
        else
        {
            val result1 = num2 / num1
            println(result1)
        }
    }
    if (choice == 2)
    {
        val result1 = num1 * num2
        println(result1)
    }
    if (choice == 3)
    {
        val result1 = num1 + num2
        println(result1)
    }
    if (choice == 4)
    {
        if (num1 > num2)
        {
            val result1 = num1 - num2
            println(result1)
        }
        else
        {
            val result1 = num2 - num1
            println(result1)
        }
    }
}