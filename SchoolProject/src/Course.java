import java.util.concurrent.PriorityBlockingQueue;

public class Course {


    private String subjectName;
    private int studentGrade;
    // private PriorityBlockingQueue<Object> courseList;

public Course(String subjectName,int studentGrade){
    this.subjectName=subjectName;
    this.studentGrade=studentGrade;


}



    public String getSubjectName() {
            return subjectName;
        }

        public int getStudentGrade() {
            return studentGrade;
        }

        public void setSubjectName() {
            this.subjectName = subjectName;
        }

        public void setStudentGrade() {
            this.studentGrade = studentGrade;
        }

        public Course() {
            int instances = 0;
            instances++;
            this.subjectName = "not set";
            this.studentGrade = 0;

        }

        public String toString(){
    return "Course : "+ getSubjectName();
        }

    }

