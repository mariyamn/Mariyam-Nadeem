import java.util.ArrayList;
public class Student {

    private String firstName;
    static int studentID;
    private static int instances = 0;

    ArrayList<Course> courseList;

    public Student( String firstName, int studentID) {

        this.firstName = firstName;
        this.studentID = studentID++;



    }
public String getFirstName(){
        return firstName;
}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudentID(){
        return studentID;
    }
public void setStudentID(){
        studentID=studentID;
    }
public String toString(){
        return "Student ID: " + getStudentID()+ "\t"+"Student Name: "+ getFirstName();
}
public static Course[] add(Course[]courses,Course num3){
        Course[] temp= new Course[courses.length+1];

        for (int i=0;i<courses.length;i++){
            temp[i]=courses[i];
        }

        temp[courses.length]=num3;
        return temp;
}

public static void average(Course[]courses){
        double sum=0;

        for(int i=0;i<courses.length;i++){
            sum+=courses[i].getStudentGrade();
        }
        System.out.println("The average is : "+sum/courses.length);
    }
        public static void print(Course[]courses){
        System.out.println(courses[instances]);
}
}




