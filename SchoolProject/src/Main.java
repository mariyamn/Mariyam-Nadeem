import java.util.Scanner;


public class Main {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        Student S1 = new Student("Bob", 001);

        System.out.println("Student ID: " + S1.getStudentID() + "     Name:  " + S1.getFirstName());

        Course C1 = new Course("Math",98);
        System.out.println("Subject Name: " + C1.getSubjectName()+ "    Student Grade: "+ C1.getStudentGrade());

        Course[] courses= new Course[3];


        Course num0= new Course("Programming", 55);

        Course num1= new Course("Science",82);

        Course num2= new Course("Spanish", 91);

        Course num3= new Course("New Course", 66);

        courses[0]=num0;
        courses[1]=num1;
        courses[2]=num2;



        courses=Student.add(courses,num3);

        System.out.println("Would you like to begin? Y/N");
        String user= input.nextLine();

        if (user.equals("Y"))
        {
            for (int i =0; i< courses.length;i++){
                System.out.println(courses[i]);
            }

            Student.print(courses);

            Student.average(courses);
        }


            }
        }






