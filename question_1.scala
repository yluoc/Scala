object question_1 {
  def Up( input : String): String={
    var newString = (for(i <- input.length-1 to 0 by -1) yield input(i)).mkString
    newString.toUpperCase()
  }
  def main(args:Array[String]): Unit={
    println(Up("its a cse 116 undergraduate course"))
    println(Up("itsacse116undergraduatecourse"))
    println(Up("its a cSe 116 undErgraduaTe course"))
    println(Up("its a cSe 116 undErgrad       uaTe course"))
  }
}
