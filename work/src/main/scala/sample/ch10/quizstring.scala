object QuizCh10String {                                              

  // 2つの文字列を繋げて、かつその長さを出すだけ
  def main(args: Array[String]): Unit =  {
    var a : StringBuilder =  new StringBuilder("Frame Wing Man");
    var b : String = " Frame Shoot";

    println(a.append(b).toString)
    println(a.length())
  }
}