fun MyPow(num:Int, step:Int): Int
{
    var res:Int = 1;
    for (i in 0 until step) res *= num;
    return res;
}

fun main(args: Array<String>) {
    print("Введите число: "); var n:Int = readln().toInt();
    print("Введите основание степени: "); var x:Int = readln().toInt();
    for (i in 0..n)
    {
        if (i == n) { println("Целочисленный показатель не существует"); break; }
        if (MyPow(x, i) == n)
        {
            println("Показатель степени равен $i.\nПример: $x^$i = $n");
            break;
        }
    }
}