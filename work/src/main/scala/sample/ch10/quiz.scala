object MyProgram:                                              

  def sumCalc(a : Int, b: Int, c : Int) : Int = {
    (((a + b) / c)* a)
  }

  @main def main: Unit =  {
    var a : Int = 5;
    var b : Int = 25;
    var c : Int = 6;

    println(sumCalc(a, b, c))
  }