object question_2 {
  def main(Args: Array[String]): Unit={
    var alist: List[String]=List()
    val string="Vanilla Donut 10 2.25"
    val newstring=string.split(" ")
    for(i <- newstring){
     alist = alist:+i
    }
    val name=alist(0)+" "+alist(1)
    val number=alist(2)
    val price=alist(3)
    var Name: String = name.toString
    var Number: Int = number.toInt
    var Price: Double = price.toDouble
    println( "Donut name: "+Name)
    println( "Donut price: $"+Price)
    println( "Donut purchased: "+Number)
  }

}
