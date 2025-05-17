object MyProgram2:
  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is %d."
    msg.format(x, math.abs(x))

  private def factorial(n: Int): Int =
    if n <= 0 then 1 else n * factorial(n - 1)

  private def formatFactorial(n: Int) =
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))

  @main def printAbsAndFactorial: Unit =
    println(formatAbs(-42))
    println(formatFactorial(5))