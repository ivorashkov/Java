package studentdatabaseapp;

import java.util.Scanner;

public class StudentData
{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = null;
    private int tuitionBalance = 0;
    private String studentID;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt user to enter students name and year
    public  StudentData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName = input.nextLine();

        System.out.println("last name:");
        this.lastName = input.nextLine();

        System.out.println("Which year:\n 1 - First\n 2 - Second\n 3 - Third\n 4 - Fourth");
        this.gradeYear = input.nextInt();

        setStudentID();
    }

    //Generate ID
    private void setStudentID(){
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void enroll(){
        //Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (0 to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") && !course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

    //View ballance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your payment: $");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String  toString(){
        return "Name:" + firstName + " " + lastName +
                "\nGrade Level:" + gradeYear +
                "\nStudent ID:" + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
