package demo

class Teacher {
    var teacherId : Int = 0
    var teacherName : String?= null
    var numberPhone : String? = null
    var address : String?=null
    var salary : Double = 0.0
    var numberWorkDay : Int = 0
    constructor(){

    }
    constructor(teacherId: Int , teacherName: String , numberPhone : String , address: String ,salary:Double,numberWorkDay: Int)
    {
        this.teacherId = teacherId
        this.teacherName = teacherName
        this.numberPhone = numberPhone
        this.address = address
        this.salary = salary
        this.numberWorkDay = numberWorkDay
    }
    fun xuat1(){
        println("Id: $teacherId , Ten: $teacherName , Phone: $numberPhone , Address: $address , Salary: ${getSalary()} , ngay nghi: $numberWorkDay")
    }
    fun getSalary(): Int {
        return numberWorkDay * 80000
    }

}