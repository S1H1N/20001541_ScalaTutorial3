object question4 {
    def totcover(y:Int):Double = y*24.95
    def discount(z:Double):Double =z*0.4
    def ship(x:Int):Double= (x>50) match{
      case true => 150+ (x-50)*0.75
      case false=> x*3}
    def total(a:Int):Double = totcover(a)- discount(totcover(a)) + ship(a)
    def main(args: Array[String]): Unit = {
      println("Total is "+ total(60) +"Rs")
    }
  }



