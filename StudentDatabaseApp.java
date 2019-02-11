package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp
{
    public static void main(String[] args)
    {
         //Ask how many new students we want to add
        StudentData stu1 = new StudentData();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());


//         //Ask how many new students we want to add
//         System.out.println("Enter number of new students to enroll:");
//         Scanner in = new Scanner(System.in);
//         int numOfStudents = in.nextInt();


//         //Create n number of new students
//         for (int n = 0; n < numOfStudents; n++){
//             StudentData stu = new StudentData();
//            stu = students[n];
//            students[n].stu.enroll(); ;
//            students[n].();
//            students.payTuition();
//            System.out.println(students.toString());
      //  }

    }
}
