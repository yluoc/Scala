import scala.io.{BufferedSource, Source}
object question_3 {
  def reader(filename: String): Map[String,String]={
    var studentarray: Map[String, String]=Map()
    val file: BufferedSource = Source.fromFile(filename)
    for(line <- file.getLines()){
      val newline=line.split(",")
      var studentid=newline(0)
      var studentname=newline(1)
      studentarray=studentarray+(studentid -> studentname)
    }
    studentarray
  }
  def main(args: Array[String]): Unit={
    println(reader("src/student.txt"))
  }
}
