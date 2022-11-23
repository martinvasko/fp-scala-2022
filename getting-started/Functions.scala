object MainFunctions {
  def main(args: Array[String]): Unit = {
    fun2()
  }

  def fun1(): Int => Int = {
    val y = 1
    def add(x: Int) = x + y

    add
  }

  def fun2() = {
    val y = 2
    val f = fun1()

    println(f(10))
  }
}
