object compare{
    var a=2;
    var b=3;
    var c=4;
    var d=5;
    var k=4.3f;
    var g=0;

    def main(args: Array[String]): Unit = {
        
        b-=1
        val exp1=b*a+c*d
        printf(" - -b * a + c *d - - = %d\n", exp1)
        d-=1

        printf(" a++ = %d\n", a)
        a+=1

        val exp2= -2*(g-k)+c
        printf("-2 * ( g - k ) +c = %.2f\n", exp2)


        printf("c = c++ = %d\n", c)
        c+=1
        c+=1
        c=c*a
        printf("c = ++c*a++ = %d",c)
        a+=1


    }
    




}