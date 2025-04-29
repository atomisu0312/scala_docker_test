object MyProgram:                                              

  @main def printAbs: Unit =  {
    var myvar : Int = 15; // valだとイミュータブルなので、次の値をアサインする段階で例外を出す
    println(myvar)

    myvar = 13

    println(myvar)
  }