package demo

class Student {
    var studentId : Int = 0
    var studentName : String?= null
    var numberPhone : String? = null
    var address : String?=null
    var batch : String?= null
    var mark1 :Double = 0.0
    var mark2 :Double = 0.0
    constructor(){

    }
    constructor(studentId: Int , studentName : String , address:String , batch: String, mark1:Double,mark2:Double)
    {
        this.studentId = studentId
        this.studentName = studentName
        this.numberPhone= numberPhone
        this.address = address
        this.batch = batch
        this.mark1 = mark1
        this.mark2 = mark2
    }

  fun xuat(){
      println("Id: $studentId , Ten :$studentName , address: $address , batch : $batch , mark1: $mark1 , mark2: $mark2, DTB: ${AvgMark()} ")
  }
    fun AvgMark():Double{
        return (mark1 + mark2)/ 2
    }
}