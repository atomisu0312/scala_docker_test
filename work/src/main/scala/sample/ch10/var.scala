object VarTest:                                            
  def main(args: Array[String]): Unit =  
    var myvar : Int = 15; // valだとイミュータブルなので、次の値をアサインする段階で例外を出す
    println(myvar)
    myvar = 13
    println(myvar)
  
