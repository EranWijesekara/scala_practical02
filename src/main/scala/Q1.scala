object assignValues {
    var k = 2
    var i = 2
    var j = 2
    var m = 5
    var n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    def main(args: Array[String]): Unit = {
        val exp1 = k + 12 * m
        val exp2 = m / j
        val exp3 = n % j
        val exp4 = m / j * j
        val exp5 = f + 10 * 5 + g
        i = i + 1
        val exp6 = i * n

        printf("k + 12 * m = %d\n", exp1)
        printf("m / j = %d\n", exp2)
        printf("n %% j = %d\n", exp3)
        printf("m / j * j = %d\n", exp4)
        printf("f + 10 * 5 + g = %.2f\n", exp5)
        printf("++i * n = %d\n", exp6)
    }
}
