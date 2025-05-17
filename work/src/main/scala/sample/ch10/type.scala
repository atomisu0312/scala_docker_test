object TypeTest {                                              

  def main(args: Array[String]): Unit =  {
    var s1 : String = "Hello"

    println(s1.getClass.getName);

    var s2 : String = "23.3"

    println(s2.toFloat) // Stringに変換メソッドが実装されている

    var i1 = 12; // いつものint To Floatも余裕
    println(i1.getClass.getName)
    var i2 = i1.asInstanceOf[Float]
    println(i2.getClass.getName) 

  }
}