object QuizCh10Int {                                              

  def sumCalc(a : Int, b: Int, c : Int) : Int = {
    (((a + b) / c)* a)
  }

  @main def write(): Unit =  {
    var a : Int = 5;
    var b : Int = 25;
    var c : Int = 6;

    println(sumCalc(a, b, c))
  }
}