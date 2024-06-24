object takeHomeSalary{
    def normal(hours :Double):Double=hours*250

    def OT(hours :Double):Double=hours*85

    def tax(salary :Double):Double=salary*0.12

    def totalSalary(nml :Double, ot :Double):Double=normal(nml)+OT(ot)

    def main(args :Array[String]):Unit={
        printf("%s %.2f","Take home salary : ",totalSalary(40,30)-tax(totalSalary(40,30)))
    }



}