import demo.Student
import demo.Teacher

fun main(args:Array<String>){
   // var Array = Teacher(1,"A","0367739967","Nguyen Du",3.9,2)
    var t1 = Teacher(1,"A","0367739967","Nguyen Du",3.9,2)
    var t2 = Teacher(2,"B","0364482913","Nguyen Hue",4.5,5)
    //var Array = Teacher(2,"B","0364482913","Nguyen Hue",4.5,5)
    var s1 = Student(1,"C","Hoang Van Thai","K19",6.7,7.9)
    var s2 = Student(3,"D","Tao Thao","K20",8.9,6.6)
//    var teacher: List<Teacher>
//    listOf(Teacher(1,"A","0367739967","Nguyen Du",3.9,2))
//    listOf(Teacher(2,"B","0364482913","Nguyen Hue",4.5,5))
    print("taecher1 :")
    t1.xuat1()
    print("taecher2 :")
    t2.xuat1()

    print("Studen 1: ")
    s1.xuat()
    print("Studen 2: ")
    s2.xuat()


}





