object question5 {
    def easyphase(d1:Int):Int = 8*d1
    def tempo(d2:Int):Int = 7*d2
    def tottime(d1:Int, d2:Int, d3:Int):Int=easyphase(d1) + tempo(d2) +easyphase(d3)
    def main(args: Array[String]): Unit = {
      println("total time is "+ tottime(2,3,2)+"mins")
    }

  }



