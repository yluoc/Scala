object question_1 extends App{
  def Doublewords(input: String): String = {
    var result = ""
    if (input.length==0 || input.trim.isEmpty) null
    else {
      for (i <- input) {
        result += i
        result += i
      }
      result
    }
  }

  def check1(a: Any) = a match {
    case a: String => Doublewords(a)
    case a: Int => "the input is an integer"
    case a: Double => "the input is a double"
    case a: Float => "the input is a float"
    case _ => "other type of data"
  }
}

object question_2 extends App{
  def multBylarge(input: Array[Int]): Int = {
    var result=0
    var lst: List[Int]=List()
    for (elements <- input) {
      lst = lst :+ elements
    }
    val newlst = lst.sortWith(_ > _)
    result += newlst(0) * newlst(1)
    result
  }


  def check2(input:Array[Any] ): Any={
    if(input.length == 0) null
    else {
      val first_ele: Any = input(0)
      first_ele match {
        case _: Int => multBylarge(input.map(_.asInstanceOf[Int]))
        case _: Double => "the input is a double"
        case _: Float => "the input is a float"
        case _: String => "the input is a string"
        case _ => "other type of array"
      }
    }
    }
  }
  
  object question_3 extends App{
  def numSum(input: String): Int={
    var number="0"
    var result=0
    for(i <- 0 to input.length-1){
      if (Character.isDigit(input.charAt(i)))
        if(i < input.length-1 && Character.isDigit(input.charAt(i+1)))
          number+=input.charAt(i)
        else{
          number+=input.charAt(i)
          result+=Integer.parseInt(number)
          number="0"
        }
    }
    result
  }

  def check3(a: Any) = a match {
    case a: String  => numSum(a)
    case a: Int => "the input is an integer"
    case a: Double => "the input is a double"
    case a : Float => "the input is a float"
    case _ => "other type of data"
  }
}

import org.scalatest.funsuite.AnyFunSuite

class hw_2_test_ques1 extends AnyFunSuite {
  test("question_1.positive testcase") {
    assert(question_1.check1("welcome") === "wweellccoommee")
    assert(question_1.check1("cse") === "ccssee")
  }
  test("question_1.negative testcase") {
    assert(question_1.check1(1) === "the input is an integer")
    assert(question_1.check1(2.0) === "the input is a double")
    assert(question_1.check1(1f) === "the input is a float")
    assert(question_1.check1('c') === "other type of data")
    assert(question_1.check1("") === null)
    assert(question_1.check1("   ") === null)
  }
}

class hw_2_test_ques2 extends AnyFunSuite {
  test("question_2.positive testcase") {
    assert(question_2.check2(Array(2, 3, 5, 7, -7, 5, 8, -5)) === 56)
    assert(question_2.check2(Array(2, 3, 5, 9, -7, 5, 9, -5 )) === 81)
  }
  test("question_2.negative testcase") {
    assert(question_2.check2(Array(2.0,3.0,4.0,5.0)) === "the input is a double")
    assert(question_2.check2(Array(2f, 3f, 5f, 9f, 7d)) === "the input is a float")
    assert(question_2.check2(Array("1","2","2")) === "the input is a string")
    assert(question_2.check2(Array('c','d','f')) === "other type of array")
    assert(question_2.check2(Array()) === null)
    assert(question_2.check2(Array(  )) === null)
  }
}

class hw_2_test_ques3 extends AnyFunSuite {
  test("question_3.positive testcase") {
    assert(question_3.check3("it 15 is25 a 20string") === 60)
    assert(question_3.check3("She is 22 yr old 5") === 27)
  }
  test("question_3.negative testcase") {
    assert(question_3.check3(1) === "the input is an integer")
    assert(question_3.check3(1.0) === "the input is a double")
    assert(question_3.check3(1f) === "the input is a float")
    assert(question_3.check3('c') === "other type of data")
  }
}
